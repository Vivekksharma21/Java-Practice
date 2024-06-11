import java.util.Scanner;

public class Recursion13_Friendspairing {
	static int pairing(int n)
	{
		if(n==1 || n==2) { return n; }
		int single = pairing(n-1);
		int pair = pairing(n-2);
		int pairways = (n-1)*pair;
		return single + pairways;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of friends : ");
		int n = sc.nextInt();
		System.out.println("Total number of ways : "+pairing(n));
		sc.close();
	}
}