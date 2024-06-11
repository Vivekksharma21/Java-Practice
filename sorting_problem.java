// Given an array where all its elements are sorted in increasing order except two swapped elements, sort it 
// in linear time. Assume there are no duplicate in the array .. 
//input = [3,8,6,7,5,9]
//output = [3,5,6,7,8,9]
import java.util.Scanner;

public class sorting_problem {
	static void sort_func(int arr[], int size)
	{
		if(arr.length<=1) return;
		int x=-1 , y=-1;
		for(int i=1;i<size;i++)
		{
			if(arr[i-1]>arr[i])
			{
				if(x==-1)
				{
					x = i-1;
					y = i;
				}
				else
				{
					y=i;
				}
			}
		}
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array element : ");
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
