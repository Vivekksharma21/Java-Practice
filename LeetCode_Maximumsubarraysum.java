import java.util.Scanner;

import vivek_util.arrayInputDisplay;

class SolutionMaxsubarray
{
	public int maxSubArray(int[] nums)
	{
		int temp=0, sum =0;
		int len = nums.length;
//		for(int i=0;i<len;i++)
//		{
//			for(int j=i;j<len;j++)
//			{
//				temp += nums[j];
//				if(temp > sum)
//				{
//					sum = temp;
//				}
//			}
//			temp =0;
//		}
//		return sum;
		
		int currentsum = nums[0];
		int maxsum = nums[0];
		for(int i=1;i<len;i++)
		{
			currentsum = Math.max(nums[i],currentsum + nums[i]);
			maxsum = Math.max(maxsum, currentsum);
		}
		return maxsum;
	}
}
public class LeetCode_Maximumsubarraysum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrayInputDisplay obj1 = new arrayInputDisplay();
		SolutionMaxsubarray obj2 = new SolutionMaxsubarray();
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		obj1.arrayInput(arr, size);
		int sum = obj2.maxSubArray(arr);
		System.out.println("Sum : "+sum);
	}
}
