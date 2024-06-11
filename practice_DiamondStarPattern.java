//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *
import java.util.*;
public class practice_DiamondStarPattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print("*");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r-1;i>=1;i--)
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print("*");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
