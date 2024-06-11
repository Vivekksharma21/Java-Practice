import java.util.Scanner;

public class binarySearch_iterative {
	static boolean binarySearch(int[] arr,int st, int end , int target)
	{
		while(st<=end)
		{
		   int mid = st + (end - st)/2;
		   if(arr[mid]== target) return true;
		   else if(arr[mid] > target) end = mid-1;
		   else st = mid + 1;
		}
		return false;
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
		
		System.out.println("Enter target element : ");
		int target = sc.nextInt();
		sc.nextLine();
	    System.out.printf("%d exists in arr : %b\n",target,binarySearch(arr,0,arr.length-1,target));
	    sc.close();
	}
}
