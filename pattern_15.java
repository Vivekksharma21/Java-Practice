/*
 *   1
 *   0 1
 *   1 0 1
 *   0 1 0 1
 *   1 0 1 0 1
 */

import java.util.*;
public class pattern_15
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();
        
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int sum = i+j;
                if (sum%2==0)
                {
                   System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println(" ");
        }
    }
}