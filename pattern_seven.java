/*    *  *  *  *  *
      *           *
      *           *
      *  *  *  *  *           hallo pattern */

import java.util.*;
public class pattern_seven
{
    public static void main(String args[])
    {
        int row ;
        int column;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();

        System.out.print("Enter column size : ");
        column = ref.nextInt();
        
        // outer loop
        for(int i=1;i<=row;i++)
        {
            // inner loop 
            for(int j=1;j<=column;j++)
            {
                if(i==1 || j==1 || i==row || j==column)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}