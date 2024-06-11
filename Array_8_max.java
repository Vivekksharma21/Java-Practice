// Calculate the maximum value out of the elements in the array ;...
import java.util.*;
class ArrayMax{
    void max(int[] ar)
    {
        int maxx = ar[0];
        for(int i=1;i<ar.length;i++)
        {
                if(ar[i]>maxx)
                {
                    maxx = ar[i];
                }
        }
        System.out.print("Maximum value in array is : "+maxx);
    }
}
public class Array_8_max {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements of array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayMax obj = new ArrayMax();
        obj.max(arr);
        sc.close();
    }
}
