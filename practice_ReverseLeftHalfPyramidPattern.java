// ******
//  *****
//   ****
//    ***
//     **
//      *
import java.util.*;
public class practice_ReverseLeftHalfPyramidPattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int r = sc.nextInt();
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
