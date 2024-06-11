import java.util.Scanner;

public class sort_Quick {
	static int partition(int[] arr, int st,int en)
	{
		int pivot = arr[st];
		int cnt = 0;
		
		for(int i=st+1;i<=en;i++)
		{
			if(arr[i]<=pivot) 
				{
				   cnt++;
				}
		}
		int pivotIdx = st + cnt ;
		
		int temp = arr[st];
		arr[st] = arr[pivotIdx];
		arr[pivotIdx] = temp;
		
		int i=st , j = en;
		
		while(i<pivotIdx && j>pivotIdx)
		{
			while(arr[i]<=pivot) i++;
			while(arr[j]>pivot) j--;
			
			if(i<pivotIdx && j> pivotIdx)
			{
				int tem = arr[i];
				arr[i] = arr[j];
				arr[j] = tem;
				i++;
				j--;
			}
		}
		return pivotIdx;
	}
	static void quicksort(int[] arr, int st , int en)
	{
		if(st>=en) return ;
		int pi = partition(arr,st,en);
		quicksort(arr,st,pi-1);
		quicksort(arr,pi+1,en);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		quicksort(arr,0,arr.length-1);
		System.out.println("Sorted array is : ");
		for(int i=0;i<size;i++)
		{
		  System.out.print(arr[i]+" ");
		}
	}
}
