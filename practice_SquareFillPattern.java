// *******
// *******
// *******
// *******
// *******
// *******
// *******
import java.util.*;
public class practice_SquareFillPattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
