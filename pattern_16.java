/*
        *****
       *****
      *****
     *****
    *****
 */

import java.util.*;
public class pattern_16
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();
        int column ;
        column = row ;

        for(int i=1;i<=row;i++)
        {
            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=column;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}