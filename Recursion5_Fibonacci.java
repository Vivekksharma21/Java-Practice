// Fibonacci series

import java.util.Scanner;

public class Recursion5_Fibonacci {
	static int fib(int n)
	{
		if(n==0) { return 0;}
		if(n==1) { return 1;}
		return fib(n-1) + fib(n-2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n= sc.nextInt();
		int ans = fib(n);
		System.out.println("Fibonacci of "+n+" is : "+ans);
		System.out.println("First "+n+" fibonacci series is : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(fib(i));
		}
		sc.close();
	}
}
