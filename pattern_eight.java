/*   *
     **
     ***
     ****                 half triangle */

import java.util.*;
public class pattern_eight
{
    public static void main(String args[])
    {
        int row;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();

        for(int i = 1; i<=row;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}