import java.util.Arrays;
public class ArraySecondMaxDec {
    public static void main(String[] args) {
        int[] array1={12,45,67,23,54};
        Arrays.sort(array1);
        int t=0;
        int i=0,j=array1.length-1;
        while(i<j)
        {
            t=array1[i];
            array1[i]=array1[j];
            array1[j]=t;
            i++;
            j--;
        } 
        System.out.println(array1[1]); 
    }
}
