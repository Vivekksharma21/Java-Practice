// Given two numbers p and q , find the value p^q using a recursive function..

import java.util.Scanner;

public class Recursion08_power {
	static int power(int p , int q) {
		// base case 
		if(q==0)
		{
			return 1;
		}
		int smallpow = power(p,q/2);
		if(q%2==0)
		{
			return smallpow * smallpow;
		}
		else
		{
			return p * smallpow * smallpow;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter p value : ");
		int p = sc.nextInt();
		System.out.println("Enter q value : ");
		int q = sc.nextInt();
		System.out.println(power(p,q));
	}
}
