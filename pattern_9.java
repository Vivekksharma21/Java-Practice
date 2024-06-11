/*  ****
    ***
    **
    *    */

import java.util.*;
public class pattern_9
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();

        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}