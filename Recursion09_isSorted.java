// check if a given array is sorted or not 

import java.util.Scanner;

public class Recursion09_isSorted {
	static boolean isSorted(int[] arr,int i)
	{
		if(i==arr.length -1) { return true; }
		if(arr[i] > arr[i+1]) { return false; }
		return isSorted( arr , i+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
	    System.out.println("Enter elements of array : ");
	    for(int j=0;j<size;j++)
	    {
	    	arr[j] = sc.nextInt();
	    }
	    System.out.println(isSorted(arr,i));
	}
}
