// Find the square root of the given non- negative value x. Round it of to the nearest floor integer value.. 
import java.util.Scanner;
public class binarySearch_Problem02 {
	static int Square_Root(int[] arr, int x)
	{
		int ans = -1 ;
		int st = 0 , end = x;
		while(st<=end)
		{
			int mid = st + (end - st)/2;
			int square = mid * mid;
			if(square == x)
			{
				return mid;
			}
			else if(square > x )
			{
				end = mid -1;
			}
			else 
			{
				st = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X value : ");
		int x = sc.nextInt();
		int[] arr = new int[x+1];
		for(int i=0;i<=x;i++)
		{
			arr[i] = i;
		}
	    System.out.println(Square_Root(arr,x));
	}
}
