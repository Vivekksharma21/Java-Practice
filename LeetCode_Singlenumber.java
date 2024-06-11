import java.util.Scanner;

import vivek_util.arrayInputDisplay;

class Solutionsinle {
    public void singleNumber(int[] nums) {
        int size = nums.length;
        int count = 0 ;
        for(int i=0;i<size;i++)
        {
        	for(int j=0;j<size;j++)
        	{
        		if(nums[i]==nums[j])
        		{
        			count++;
        		}
        	}
        	if(count==1)
        	{
        		System.out.println("Single number is : "+nums[i]);
        		return;
        	}
        	else
        	{
        		count = 0;
        	}
        }
    }
}
public class LeetCode_Singlenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solutionsinle obj = new Solutionsinle();
		arrayInputDisplay obj2 = new arrayInputDisplay();
		System.out.println("Enter size of the array : ");
		int s = sc.nextInt();
		int[] arr = new int[s];
		obj2.arrayInput(arr, s);
		obj.singleNumber(arr);
	}
}
// output 
//Enter size of the array : 
//6
//Enter array element : 
//4
//3
//4
//3
//2
//4
//Single number is : 2
