/* move all 0's to the end of it while maintaining the relative order of the non-zero elements 
   NOte that u must do this in place without making a copy of the array */
import java.util.Scanner;
import vivek_util.Swap;
public class sorting_zeros {
	public static void sorting_zero(int[] arr)
	{
		Swap obj = new Swap();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]==0 && arr[j+1]!=0)
				{
					obj.swapping(arr, j, j+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i =0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		sorting_zero(arr);
		System.out.println("After sorting : ");
		for(int i=0;i<size ; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
