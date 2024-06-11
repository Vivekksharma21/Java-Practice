// find the last occurance of an element x in a given array .. 
import java.util.*;
class lastoccurance{
    int search(int[] arr,int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search element : ");
        int search = sc.nextInt();
        sc.close();
        for(int j=size-1;j>=0;j--)
        {
            if(arr[j]==search)
            {
                System.out.println(search+" found last occurance and index is : "+j);
                return 1 ;
            }
        }
        return -1;
    }
}
public class Array_11_lastoccurance {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for(int i=0;i<size;i++)  // for taking input
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are : ");
        for(int i=0;i<size;i++)   // for printing array element 
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        lastoccurance obj = new lastoccurance();
        int output = obj.search(arr,size);
        if(output == -1)
        {
            System.out.println("oops!! Given element is found in the array ..");
        }
        sc.close();
    }
}
