// //      *
// //     * *
// //    *   *
// //   *     *
// //  *       *
// // *         *
// //  *       *
// //   *     *
// //    *   *
// //     * *
// //      *
// import java.util.*;
// class HollowDiamondPyramid{
//     void hollow(int r)
//     {
//         for(int i=1;i<=r;i++)
//         {
//             for(int j=1;j<=(r-i);j++)
//             {
//                 System.out.print("v");
//             }
//             int c=r;
//             for(int k=1;k<=c;k++)
//             {
//                 if(r==c)
//                 {
//                     System.out.print("*");
//                 }
//                 c--;
//             }
//             for(int l=1;l<=(i+(i-1));l++)
//             {
//                 System.out.print(" ");
//             }
//             for(int m=i+1;m<r;m++)
//             {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// public class practice_HollowDiamondPyramid {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of row : ");
//         int a = sc.nextInt();
//         HollowDiamondPyramid obj = new HollowDiamondPyramid();
//         obj.hollow(a);
//     }
// }



import java.util.*;

class HollowDiamondPyramid {
    void hollow(int r) {
        // Upper half of the diamond
        for (int i = 1; i <= r; i++) {
            // Print leading spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            // Print left half of the diamond
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Double space for inner spaces
                }
            }

            System.out.println();
        }

        // Lower half of the diamond (excluding the center row)
        for (int i = r - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            // Print left half of the diamond
            for (int k = 1; k <= i; k++) {
                if (k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Double space for inner spaces
                }
            }

            System.out.println();
        }
    }
}

public class practice_HollowDiamondPyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the diamond: ");
        int a = sc.nextInt();
        HollowDiamondPyramid obj = new HollowDiamondPyramid();
        obj.hollow(a);
    }
}
