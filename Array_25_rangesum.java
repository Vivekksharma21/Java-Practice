import java.util.*;
import vivek_util.*;
public class Array_25_rangesum {
	static int[] makeprefixsum(int[] arr) {
		for(int i=1;i<arr.length;i++)
		{
			arr[i] = arr[i] + arr[i-1];
			//System.out.print(arr[i]);
		}
		return arr ;
	}
//	public void queries(int[] arr)
//	{
//		System.out.println("Enter number of queries : ");
//		int q = sc.nextInt();
//		while(q>0)
//		{
//			int start , end,ans =0;
//			System.out.println("Enter range ");
//			System.out.println("Enter starting range : ");
//			start = sc.nextInt();
//			System.out.println("Enter ending range : ");
//			end = sc.nextInt();
//			for(int i=start;i<=end;i++)
//			{
//				arr[i] = arr[i] + arr[i-1];
//				ans +=arr[i];
//			}
//			System.out.println("Sum of the given range = "+ans);
//			
//		}
//	}
//	public void sum(int[] arr)
//	{
//		
////		for(int i=0;i<size;i++)
////		{
////			System.out.print(arr[i]+" ");
////		}
//		queries(arr);
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size+1];
	    
		System.out.println("Enter "+size+ " elements : ");
		for(int i=1;i<=size;i++)
        {
            arr[i] = sc.nextInt();
        }
		int[] prefsum = makeprefixsum(arr);
		System.out.println("Enter number of queries : ");
		int q=sc.nextInt();
		while(q-- > 0)
		{
			System.out.println("Enter range : ");
			int l = sc.nextInt();
			int r = sc.nextInt();
			int ans = prefsum[r] - prefsum[l-1];
			System.out.println("Sum : "+ans);
		}
		sc.close();
	}
}


