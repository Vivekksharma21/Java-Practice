// Given a rotated array, find the index of the minimum element in the array. Follow 0 - based indexing.
// It is guranteed that all the elements in the array are unique.
// input = [3,4,5,1,2] , output : 3 
public class binarySearch_Problem03 {
	static int minimumElementIndex(int[] arr)
	{
		int ans = -1;
		int st = 0 , n = arr.length-1 , end = n-1;
		while(st<=end)
		{
			int mid = st + (end - st)/2;
			if(arr[mid] > arr[n-1])
			{
				st = mid + 1;
			}
			else if(arr[mid]<= arr[n-1])
			{
				end = mid -1;
				ans = mid;
			}
			else 
			{
				st = mid + 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {6,1,2,3,4,5};
		System.out.println(minimumElementIndex(arr));
	}
}
