// Taking an array as an input and priting its elements..

import java.util.*;
public class Array_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();   

        int numbers[] = new int[size];
        
        // for  input
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter "+(i+1)+" number : ");
            numbers[i] = sc.nextInt();
        }


        // for output
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Numbers "+(i+1)+" is : " +numbers[i]);
        }
        sc.close();
    }
}