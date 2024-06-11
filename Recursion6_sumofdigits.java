// Given an integer, find out the sum of its digits using recursion..
import java.util.Scanner;
public class Recursion6_sumofdigits {
	static int sumofdigits(int n){
		if(n>=0 && n<=9){
			return n;
		}
		return (n%10) + sumofdigits(n/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digits : ");
		int n = sc.nextInt();
		System.out.println("Sum of digits is : "+sumofdigits(n));
		sc.close();
	}
}