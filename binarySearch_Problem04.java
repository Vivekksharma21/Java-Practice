// Given the rotated sorted array of integers. which contains distinct elements and an integer target, return
// the index of target if it is in the array. Otherwise return -1.
// input : arr = [3,4,5,1,2] , target = 4
// output = 1 
public class binarySearch_Problem04 {
	static int targetIndex(int[] arr,int target)
	{
		int n = arr.length;
		int st = 0 , end = n-1;
		while(st<=end)
		{
			int mid = st + (end - end)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]<arr[end]) // mid to end sorted
			{
				if(target>arr[mid] && target <=arr[end])
				{
					st = mid +1;
				}
				else
				{
					end = mid -1;
				}
			}
			else // st to mid sorted 
			{
				if(target >= arr[st] && target < arr[mid])
				{
					end = mid -1;
				}
				else
				{
					st = mid +1 ;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {7,8,9,10,11,12,13,14,15,1,2,3,4,5,6};
		int target = 20;
		System.out.println(targetIndex(arr,target));
	}
}
