import java.util.*;
import vivek_util.*;
public class Array_24_prefix_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		arrayInputDisplay obj = new arrayInputDisplay();
		obj.arrayInput(arr, size);
		
		System.out.println("After prefix sum array is : ");
		System.out.println(arr[0]);
		for(int i=1;i<size;i++)
		{
			arr[i] = arr[i] + arr[i-1];
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
