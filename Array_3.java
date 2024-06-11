// Take an array of names as input from the user and print them on the screen...
import java.util.*;
public class Array_3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        String names[] = new String[size];


        // input name 
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter "+(i+1)+" person name : ");
            names[i] = sc.next();
        }

        // for output
        for(int i=0;i<names.length;i++)
        {
            System.out.println("Names "+(i+1)+ " is : " +names[i]);
        }
        sc.close();

    }
}