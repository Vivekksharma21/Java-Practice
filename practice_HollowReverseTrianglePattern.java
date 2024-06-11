// ***********
//  *       *
//   *     *
//    *   *
//     * *
//      *
import java.util.*;
class HollowReverseTrianglePattern
{        
    void hollow(int r)
    {
        for (int i = r; i>=1; i--) {
            // Print leading spaces
            for (int j = i; j < r; j++) {
                System.out.print(" ");
            }

            // Print stars or spaces for each row
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == r || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
public class practice_HollowReverseTrianglePattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        HollowReverseTrianglePattern obj = new HollowReverseTrianglePattern();
        obj.hollow(a);

    }
}
