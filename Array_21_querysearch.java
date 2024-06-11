import java.util.*;
import vivek_util.*;

public class Array_21_querysearch {

    static void search(int[] arr, int q,int s) {
        int size = arr.length;
        int ans = 0;
        Scanner scan = new Scanner(System.in);

        while (q > 0) {
//            System.out.print("Enter a number to search: ");
//            int s = scan.nextInt();
            ans = 0; // Reset the ans for each query

            for (int i = 0; i < size; i++) {
                if (arr[i] == s) {
                    ans = 1;
                    break; // Element found, no need to continue searching
                }
            }

            if (ans == 1) {
                System.out.println("Yes, the number is present in the array.");
            } else {
                System.out.println("No, the number is not present in the array.");
            }

            q--;

            if (q > 0) {
                System.out.println("Do you want to search again? (yes/no): ");
                String response = scan.nextLine();

                if (!response.equalsIgnoreCase("yes")) {
                    break; // Exit if the user doesn't want to search again
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayInputDisplay obj = new arrayInputDisplay();

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        System.out.print("Enter a number to search: ");
        int s = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter how many times you want to execute queries: ");
        int q = sc.nextInt();

        obj.arrayInput(arr, size);
        obj.arrDisplay(arr, size);

        search(arr, q,s);
        sc.close();
    }
}
