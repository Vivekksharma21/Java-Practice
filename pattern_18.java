/*
             1
            212
           32123
          4321234
         543212345

 */

import java.util.*;
public class pattern_18
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

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            for(int l=2;l<=i;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}