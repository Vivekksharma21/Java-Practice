// Find the maximum and minimum number in an array of integers...

import java.util.*;
public class Array_4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.println("Enter elements of array : ");

        // input
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter "+(i+1)+" element : ");
            number[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        // output
        for(int i=0;i<number.length;i++)
        { 
            System.out.println((i+1)+" element is : "+number[i]);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]>=max)
            {
                max = number[i];
            }
            if(number[i]<=min)
            {
                min = number[i];
            }
        }
        System.out.println("Maximum value is : "+max);
        System.out.println("Minimum value is : "+min);
        sc.close();
    }
}