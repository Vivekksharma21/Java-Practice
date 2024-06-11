// wap to find the first occurrence of an element in an array ...

import java.util.Scanner;

public class Recursion10_firstoccurence {
	static int firstoccur(int[] arr,int ele,int i)
	{
		if(i==arr.length-1 && arr[i]!=ele) { 
			System.out.println("Searching element not found..");
			return -1; }
		if(arr[i] == ele) { 
			System.out.println("Searching element found at position : ");
			return i; }
		return firstoccur(arr,ele,i+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j=0 ; // starting index 
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements of array : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter searching element : ");
		int search = sc.nextInt();
		System.out.println(firstoccur(arr,search,j));
	}
}
