/*
          *        *
          **      **
          * *    * *
          *  *  *  *
          *   **   *
          *   **   *
          *  *  *  *
          * *    * *
          **      **
          *        *

 */
import java.util.*;
public class pattern_21
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();

        // for upper part.
        for(int i=1;i<=row;i++)
        {  
            ///   left side 
            for(int j=1;j<=i;j++)
            {
                if(j==1 || i==j )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int k=1;k<=2*(row-i);k++)
            {
                System.out.print(" ");
            }

           //  for right side 
            for(int l=1;l<=i;l++)
            {
                if(l==1 || l==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for lower part 
        for(int i=row;i>=1;i--)
        {  
            ///   left side 
            for(int j=1;j<=i;j++)
            {
                if(j==1 || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for(int k=1;k<=2*(row-i);k++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++)
            {
                if(l==1 || l==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}