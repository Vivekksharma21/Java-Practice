import java.util.Scanner;

public class binarySearch_recusion {
	static boolean binarySearch_recursion(int[] arr,int st , int end , int target)
	{
		if(st>end) return false;
		
		int mid = st + (end-st)/2;
		// base case 
		if(arr[mid]== target) return true;
		
		else if(arr[mid] > target) 
			return binarySearch_recursion(arr,st,mid-1,target);
		else
			return binarySearch_recursion(arr,mid+1,end,target);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array  :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target element : ");
		int target = sc.nextInt();
		System.out.printf("%d exists in arr : %b\n",target,binarySearch_recursion(arr,0,arr.length-1,target));
	}
}
