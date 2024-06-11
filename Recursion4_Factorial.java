// wap to find the factorial of given number ... 

import java.util.Scanner;

public class Recursion4_Factorial {
	static long fac(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n * fac(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Facotorial of "+n+" is : ");
		long ans = fac(n);
		System.out.println(ans);
		sc.close();
	}
}
