import java.util.Arrays;
import java.util.Scanner;

import vivek_util.arrayInputDisplay;
class Solutioncon {
    public boolean containsDuplicate(int[] nums) {
			Arrays.sort(nums);
			for(int i=1;i<nums.length;i++)
			{
				if(nums[i]==nums[i-1])
				{
					return true;
				}
			}
			return false;
    }
}
public class LeetCode_ContainsDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrayInputDisplay obj1 = new arrayInputDisplay();
		Solutioncon obj2 = new Solutioncon();
		System.out.println("Enter the size of the array : ");
		int s = sc.nextInt();
		int[] arr =new int[s];
		obj1.arrayInput(arr, s);
		boolean ans = obj2.containsDuplicate(arr);
		if(ans)
		{
			System.out.println("true");
		}
		else { System.out.println("false"); }
		sc.close();
	}
}

//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
