// given "2 * n" board and tiles of size "2*1" count the number of ways to title 
// the given board using the 2*1 tiles.. 

import java.util.Scanner;

public class Recurrence12_board {
	static int board(int n)
	{
		if(n==0 || n==1) { return 1; }
		// for verticle 
		int ver = board(n-1);
		// for horizontal 
		int horiz = board(n-2);
		return ver + horiz;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		System.out.println("Total ways : " +board(n));
	}
}
