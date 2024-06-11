// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6
import java.util.*;
public class practice_Reverse_number_Triangle_Pattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=r;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
