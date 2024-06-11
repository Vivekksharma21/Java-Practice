// count the number of occurance of a particular element x ...
import java.util.*;
class functions
{
    Scanner sc = new Scanner(System.in);
    public void input_show_occurance_arrayelements(int size)
    {
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are : [");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

        System.out.println("\nEnter a searching element : ");
        int search = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(arr[i]==search)
            {
                System.out.print(search+" found at index : "+i);
            }
        }
        
    }
}
public class Array_10_occurance {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        functions obj = new functions();
        obj.input_show_occurance_arrayelements(size);
        sc.close();
    }
}
