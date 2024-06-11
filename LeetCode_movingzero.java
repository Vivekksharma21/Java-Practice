import java.util.Arrays;
import java.util.Scanner;

import vivek_util.arrayInputDisplay;

class Solutionmoving {
    public void moveZeroes(int[] nums) {
    	arrayInputDisplay obj1 = new arrayInputDisplay();
//    	Arrays.sort(nums);
//    	int count =0;
//        for(int i=0;i<nums.length;i++)
//        {
//        	if(nums[i]==0)
//        	{
//        		count++;
//        	}
//        }
//        for(int i=count;i<nums.length;i++)
//        {
//        	System.out.print(nums[i]+" ");
//        }
//        for(int i=0;i<count;i++)
//        {
//        	System.out.print(nums[i]+" ");
//        }
    	int nonzeroIndex = 0;
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i] != 0)
    		{
    			nums[nonzeroIndex] = nums[i];
    			if(nonzeroIndex != i)
    			{
    				nums[i] = 0;
    			}
    			nonzeroIndex++;
    		}
    	}
    	obj1.arrDisplay(nums,nums.length);
    }
}
public class LeetCode_movingzero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solutionmoving obj = new Solutionmoving();
		arrayInputDisplay obj1 = new arrayInputDisplay();
		System.out.println("Enter size of the array : ");
		int s = sc.nextInt();
		int[] arr = new int[s];
		//System.out.println("Enter elements of the array : ");
		obj1.arrayInput(arr, s);
		obj.moveZeroes(arr);
		sc.close();
	}
}
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]