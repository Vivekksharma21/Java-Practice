import java.util.Scanner;

import vivek_util.arrayInputDisplay;

class Solutionplus
{
	public void digits(int[] digits)
	{
		arrayInputDisplay obj1 = new arrayInputDisplay();
		for(int i=digits.length-1;i>=0;i--)
		{
			if(digits[i]<9)
			{
				digits[i]++;
				obj1.arrDisplay(digits,digits.length);
				return;
			}
			digits[i] = 0;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		obj1.arrDisplay(digits,digits.length);
		return;
	}
}
public class LeetCode_Plusone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solutionplus obj = new Solutionplus();
	    System.out.println("Enter size of the array : ");
	    int size = sc.nextInt();
	    int[] arr = new int[size];
	    System.out.println("Enter elements of array : ");
	    for(int i=0;i<size;i++)
	    {
	    	arr[i] = sc.nextInt();
	    }
	    System.out.println("After adding one , answer is : ");
	    obj.digits(arr);
	}
}
