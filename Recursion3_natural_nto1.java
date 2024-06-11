// wap to print all natural numbers from n to 1 using recursion..

import java.util.Scanner;

public class Recursion3_natural_nto1 {
	static void print(int n)
	{
		System.out.println(n);
		if(n==1)
		{
			return;
		}
		print(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("Natural number from "+n+" to 1 is : ");
		print(n);
		sc.close();
	}
}
