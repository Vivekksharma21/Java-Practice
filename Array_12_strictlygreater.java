// count the number of elements stictly greater than element x ..
import java.util.*;
public class Array_12_strictlygreater {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)   // taking array input from the user
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter a element : ");
        int x = sc.nextInt();
        int count = 0;
        System.out.print("\nArray elements are : ");   
        for(int i=0;i<size;i++)
        {                                   // displaying array elements 
            System.out.print(arr[i]+" ");
        }

        for(int j=0;j<size;j++)
        {
            if(arr[j]==x)
            {
                if(arr[j]>x)
                {
                    count++;
                }  
            }
        }
        if(count==0)
        {
            System.out.println("\nGiven element "+x+" is not present in the array ");
        }
        else 
        {
            System.out.println("\nIn the array their are "+count+" elements which are greater than : "+x);
        }
        sc.close();
    }
}
