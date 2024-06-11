// wap to print all natural numbers from 1 to n using recursion..

import java.util.Scanner;

public class Recursion2_natural {
	static void print(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return ;
		}
		print(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("First "+n+" natural number is : ");
		print(n);
		sc.close();
	}
}
