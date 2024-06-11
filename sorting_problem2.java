// Given an array of positive and negative integers , segregate then in linear time and constant space . 
// The output should print all negative numbers , followed by all positive numbers.. 

import java.util.Scanner;

public class sorting_problem2 {
//	static int partition(int[] arr,int st,int end)
//	{
//		int pivot = 0;
//		int cnt = 0;
//		for(int i=st+1;i<=end;i++)
//		{
//			if(arr[i]<= pivot) cnt ++;
//		}
//		int pivotIdx = st + cnt ;
//		
//		int temp = arr[st];
//		arr[st] = arr[pivotIdx];
//		arr[pivotIdx] = temp ;
//		
//		int i=st; int j = end;
//		while(i<=pivotIdx && j>pivotIdx)
//		{
//			while(arr[i]<=pivot) i++;
//			while(arr[j]> pivot) j--;
//			
//			if(i<pivotIdx && j>pivotIdx)
//			{
//				int tem = arr[i];
//				arr[i] = arr[j];
//				arr[j] = tem;
//				i++;
//				j--;
//			}
//		}
//		return pivotIdx;
//	}
//	static void sort_funct(int[] arr,int st , int end)
//	{
//		if(st >= end) return;
//		int pi = partition(arr,st,end);
//		sort_funct(arr,st,pi-1);
//		sort_funct(arr,pi+1,end);
//	}
	static void sort_funct(int[] arr)
	{
		int i = 0 , j = arr.length-1;
		while(i<j)
		{
			while(arr[i]<0) i++;
			while(arr[j]>=0) j--;
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Before seperation array is : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		sort_funct(arr);
		System.out.println("After seperation array is : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
