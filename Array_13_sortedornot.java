// check the given array is sorted or not ... 
import java.util.*;
public class Array_13_sortedornot {
    public static boolean isSorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
            // if(arr[i]<arr[i+1])
            // {
            //     return false;
            // }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("\nEnter elements of array : ");
        for(int i=0;i<size;i++)   // taking input in array 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nDisplaying array elements : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        if(isSorted(arr)){
            System.out.println("sorted array");
        }
        else{
            System.out.println("not sorted ");
        }
        sc.close();
    }
}
