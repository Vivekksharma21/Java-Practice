//      1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 
// 6 6 6 6 6 6 

import java.util.*;
public class practice_NumbertrianglePattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++) // outer loop 
        {
            for(int j=1;j<=r-i;j++)  // for space 
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
