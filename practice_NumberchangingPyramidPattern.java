// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21 
import java.util.*;
public class practice_NumberchangingPyramidPattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int r = sc.nextInt();
        int change = 1;
        for(int i = 1 ;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(change +" ");
                change++;
            }
            System.out.println();
        }
    }
}
