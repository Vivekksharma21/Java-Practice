import java.util.*;
import vivek_util.*;
public class Array_26_partition {
	static int totalsum(int[] arr)
	{
		int ans = 0;
		for(int i=0;i<arr.length;i++)
		{
			ans += arr[i];
		}
		//System.out.println(ans);
		return ans ;
	}
	static boolean partition(int[] arr)
	{
		int totalsum = totalsum(arr);
		int prefixsum =0,suffixsum;
		for(int i=0;i<arr.length;i++)
		{ 
			prefixsum += arr[i];
		    suffixsum = totalsum - prefixsum;
		    if(prefixsum == suffixsum)
		    {
		    	System.out.println("\nYeah!! Partion is possible..");
		    	return true;
		    }
		}
	    System.out.println("\nOops!! Partion not possible..");
    	return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		arrayInputDisplay obj = new arrayInputDisplay();
		obj.arrayInput(arr, size);
		obj.arrDisplay(arr, size);
		partition(arr);
		sc.close();
	}
}
