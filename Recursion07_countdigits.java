// Return the count of digits in a given numbers.. 

import java.util.Scanner;

public class Recursion07_countdigits {
	static int count=0;
	static int countfunc(int n)
	{
		// base case 
		if(n==0)
		{
			return 0;
		}
		
	    return 1 + countfunc(n/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		System.out.println(countfunc(num));
		sc.close();
	}
}
