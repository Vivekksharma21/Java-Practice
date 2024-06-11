// // find the unique number in a given array..

// import java.util.*;
// import vivek_util.*;
// class find_unique{
//     public void unique(int[] arr)
//     {
//         int ans = -1;
//         int size = arr.length;
//         for(int i=0;i<size-1;i++)
//         {
//             for(int j=i+1;j<size-1;j++)
//             {
//             	if(arr[i]==arr[j])
//             	{
//             		arr[i] = 0;
//                     arr[j] = 0;
//             	}
//             }
//         }
//         for(int i=0;i<size;i++)
//         {
//             if(arr[i]!=0)
//             {
//                 ans = arr[i];
//             }
//         }
//         System.out.println("\nUnique : "+ans);
//     }
// }
// public class Array_16_unique {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         arrayInputDisplay obj = new arrayInputDisplay();
//         obj.arrayInput(arr,size);
//         obj.arrDisplay(arr,size);

//         find_unique obj2 = new find_unique();
//         obj2.unique(arr);
//         sc.close();

//     }
// }

import java.util.*;
import vivek_util.*;

class find_unique {
    public void unique(int[] arr) {
        int ans = -1;
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            if (arr[i] != 0) { // Skip elements that are already marked as 0
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        arr[i] = 0;
                        arr[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                ans = arr[i];
                break; // Break when the unique number is found
            }
        }

        System.out.println("\nUnique: " + ans);
    }
}

public class Array_16_unique {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        arrayInputDisplay obj = new arrayInputDisplay();
        obj.arrayInput(arr, size);
        obj.arrDisplay(arr, size);

        find_unique obj2 = new find_unique();
        obj2.unique(arr);

        sc.close();
    }
}
