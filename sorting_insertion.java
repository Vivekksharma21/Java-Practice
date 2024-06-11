import java.util.Scanner;
import vivek_util.Swap;
public class sorting_insertion {
	
	public static void insertion_sort(int[] arr)
	{
		Swap obj = new Swap();
		for(int i=1;i<arr.length;i++)
		{
			int j=i;
			while(j>0 && arr[j]< arr[j-1])
			{
				obj.swapping(arr,j,j-1);
				j--;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Before sorting : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		insertion_sort(arr);
		System.out.println("After sorting : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
