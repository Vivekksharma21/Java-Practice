/*
         1
       1 2 
     1 2 3 
   1 2 3 4

 */

import java.util.*;
public class pattern_12
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        row = ref.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int k=1;k<=row-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}