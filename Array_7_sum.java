// calculate the sum of the elements in the given array ...
import java.util.*;
class Array_element_sum{
    void sum(int[] ar,int sizee)
    {
        int sum = 0;
        for(int i=0;i<sizee;i++)
        {
            sum += ar[i];
        }
        System.out.print("Sum is : "+sum);
    }
}
public class Array_7_sum {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter size of array : ");
       int size = sc.nextInt(); 
       int[] arr = new int[size];
       System.out.print("Enter elements of array : ");
       for(int i=0;i<size;i++)
       {
          arr[i] = sc.nextInt();
       }
       Array_element_sum obj = new Array_element_sum();
       obj.sum(arr,size);
       sc.close();
    }
}
