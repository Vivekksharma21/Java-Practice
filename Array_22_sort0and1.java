// sort an array consisting of only 0s and 1s...
import java.util.*;
import vivek_util.*;
public class Array_22_sort0and1 {
	arrayInputDisplay obj1 = new arrayInputDisplay();
	static void swapping(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
	static void sort(int[] arr,int size) {
		int left=0;
		int right=size-1;
		while(left<right)
		{
			if(arr[left]==1 && arr[right]==0)
			{
				swapping(arr,left,right);
			}
			if(arr[left]==0)
			{
				left++;
			}
			if(arr[right]==1)
			{
				right--;
			}
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		arrayInputDisplay obj = new arrayInputDisplay();
		obj.arrayInput(arr, size);
		obj.arrDisplay(arr, size);
		System.out.println("\nAfter sorting : ");
		sort(arr,size);
		sc.close();
	}
}
