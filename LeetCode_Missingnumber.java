import java.util.Arrays;
import java.util.Scanner;

import vivek_util.arrayInputDisplay;

class Solutionmissing {
    public void missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                System.out.println("Missing number is: " + (nums[i] + 1));
                return;
            }
        }

        // If no missing number found in the loop, it means the missing number is the last number.
        System.out.println("Missing number is: " + (nums[nums.length - 1] + 1));
    }
}
public class LeetCode_Missingnumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrayInputDisplay obj1 = new arrayInputDisplay();
		Solutionmissing obj2 = new Solutionmissing();
		System.out.println("Enter the size of the array : ");
		int s = sc.nextInt();
		int[] arr = new int[s];
		obj1.arrayInput(arr, s);
		obj2.missingNumber(arr);
		//System.out.println("Output is : "+ans);
		sc.close();
	}
}

//Example 1:
//
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//Example 2:
//
//Input: nums = [0,1]
//Output: 2
//Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//Example 3:
//
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
