import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee salary: ");
		int sal=sc.nextInt();
		salaryAllowance(sal);
    }
    public static void salaryAllowance(int sal)
    {
        double da=sal*0.12;
		double hra=sal*0.13;
		double pf=sal*0.15;
		double grosssal=da+hra+pf+sal;
		System.out.println("Employee gross salary is: "+grosssal);
    }
}
