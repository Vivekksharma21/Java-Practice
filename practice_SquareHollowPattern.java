// ******
// *    *
// *    *
// *    *
// *    *
// ******

import java.util.*;
public class practice_SquareHollowPattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size : ");
        int r = sc.nextInt();
        System.out.print("Enter Column size : ");
        int c = sc.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(j == 1 || j== c || i==1 || i==r)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
