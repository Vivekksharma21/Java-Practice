import java.util.Scanner;

import vivek_util.Swap;
public class sorting_selection {
	public static void selection_sort(int[] arr) {
		//Swap obj = new Swap();
		for(int i=0;i<arr.length-1;i++)
		{
			int minpos = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minpos]>arr[j])
				{
					minpos = j;
				}
			}
				int temp = arr[minpos];
				arr[minpos] = arr[i];
				arr[i] = temp;
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
		selection_sort(arr);
		System.out.println("After sorting : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
