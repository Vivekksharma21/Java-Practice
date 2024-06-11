// Given an array of size N containing only 0s , 1s and 2s ; sort the array in ascending order...
import java.util.Scanner;
public class sorting_problem3 {
	static void swap(int[] arr, int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void sort_func(int[] arr, int size)
	{
		int lo =0 , mid = 0 , hi = arr.length-1;
		while(mid <= hi)
		{
			if(arr[mid]==0)
			{
				swap(arr,lo,mid);
				lo++;
				mid++;
			}
			else if(arr[mid]==1) mid++;
			else // if(arr[mid] == 2)
			{
				swap(arr,mid,hi);
				hi--;
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
		sort_func(arr,size);
		System.out.println("Sorted array is : ");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
