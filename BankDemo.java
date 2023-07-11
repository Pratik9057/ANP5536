import java.util.Scanner;
class Account{
    double balance=25000;
    public void creadit(double camount){
        balance+=camount;
        System.out.println("Creadited "+camount+" Balance is: "+balance);
    }
    public void deposit(double damount){
        balance-=damount;
        System.out.println("Deposited "+damount+" Balance is: "+balance);
    }
    public void currentBalance(){
        System.out.println("Balance is: "+balance);
    }
    public void calculateInterest(double interestRate,int months){
        double interestValue=balance*interestRate*months;
        balance+=interestValue;
        System.out.println("After adding Interest Value Balance is: "+balance);
    }
}
public class BankDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double interestRate=0.02;
        int months=12;
        Account ac=new Account();
        System.out.println("Enter Deposit amount: ");
        double damount=sc.nextDouble();
        ac.deposit(damount);
        System.out.println("Enter Creadit amount: ");
        double camount=sc.nextDouble();
        ac.creadit(camount);
        ac.currentBalance();
        ac.calculateInterest(interestRate, months);
    }
}
