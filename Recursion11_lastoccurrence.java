// WAP to find the last occurrence of an element in an array..

import java.util.Scanner;

public class Recursion11_lastoccurrence {
	static int lastOccur(int[] arr, int startindex,int sele)
	{
		if(startindex<0) { return -1; }
		if(arr[startindex]==sele)
		{
			System.out.println("Last occurence of "+sele+" ,at position : ");
			return startindex+1;
		}
		return lastOccur(arr,startindex-1,sele);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter searching element : ");
		int searchingelement = sc.nextInt();
		int startindex = arr.length -1; 
		System.out.println(lastOccur(arr,startindex,searchingelement));
	}
}
