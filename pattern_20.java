/*
            *
           ***
          *****
         *******
         *******
          *****
           ***
            *

 */
import java.util.*;
public class pattern_20
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();
        
        /// upper half 
        for(int i=1;i<=row;i++)
        {
            // space 
            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }

            // for star 
            for(int j=1;j<=((2*i)-1);j++)
            {
                System.out.print("*");      // try in place of * as j value
            }
            System.out.println();
        }

        // lower half  
        for(int i=row;i>=1;i--)
        {
            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}