// Take an array of numbers as input and check if it is an array sorted in ascending order...
import java.util.*;
public class Array_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        
        int element[] = new int[size];
        //input
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter "+(i+1)+" element : ");
            element[i] = sc.nextInt();
        } 

        for(int i=0;i<element.length;i++)
        { 
            System.out.println((i+1)+" element is : "+element[i]);
        }

        boolean isAscending = true ;

        for(int i=0;i<element.length-1;i++)    // element.length-1 as termination condition
        {
            if(element[i]>element[i+1])   // this is the condition for descending order..
            {
                isAscending = false;
            }
        }

        if(isAscending)
        {
            System.out.println("Array is sorted in ascending order..");
        }
        else 
        {
            System.out.println("Array is not sorted in ascending order..");
        }
        sc.close();
    }
}