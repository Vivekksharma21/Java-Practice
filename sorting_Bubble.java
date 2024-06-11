import java.util.Scanner;
import vivek_util.*;
public class sorting_Bubble {
	static void bubble_sort(int[] arr,int size)
	{
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
				    arr[j] = arr[j+1];
				    arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		arrayInputDisplay obj = new arrayInputDisplay();
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		obj.arrayInput(arr, size);
		bubble_sort(arr,size);
		obj.arrDisplay(arr, size);
	}
}
