//     1 
//    1 1 
//   1 2 1 
//  1 3 3 1
import java.util.*;
class PascalTriangle
{
    void pascal(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(r-i);j++)
            {
                System.out.print(" ");
            }
            int c = 1;
            for(int k=1;k<=i;k++)
            {
                System.out.print(c+" ");
                c = c*(i-k)/c;
            }
            System.out.println();
        }
    }
}
public class practice_PascalTriangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int a = sc.nextInt();
        PascalTriangle obj = new PascalTriangle();
        obj.pascal(a);
    }
}
