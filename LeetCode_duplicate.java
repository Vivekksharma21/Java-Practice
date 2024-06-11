import java.util.Scanner;

class Solutiondupli {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;  // Initialize with 1 since the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        System.out.println("Unique elements:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return uniqueCount;
    }
}

public class LeetCode_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solutiondupli obj = new Solutiondupli();
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int uniqueCount = obj.removeDuplicates(arr);
        System.out.println("Count of unique elements: " + uniqueCount);
    }
}
