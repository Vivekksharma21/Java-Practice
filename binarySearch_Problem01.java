// Find the first occurence of a given element x , given that the given array is sorted. If no occurence
// of X is found then return -1 ..
public class binarySearch_Problem01 {
	static int firstOccurence(int[] arr,int target)
	{
		int st = 0 , end = arr.length-1;
		int temp = -1;
		while(st<= end)
		{
			int mid = st + (end - st)/2;
			if(arr[mid]== target)
			{
				temp = mid;
				end = mid-1;
			}
			else if(arr[mid] > target)
			{
				end = mid -1;
			}
			else
			{
				st = mid + 1;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		
		int[] arr = {2,5,5,5,6,6,8,9,9,9};
		int target = 10;
		System.out.println(firstOccurence(arr,target));
	}
}
