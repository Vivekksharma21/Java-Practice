// Search element in rotated sorted array with duplicate elements . Return true if the element is found else 
// return false
// input: arr = [0,0,0,1,1,1,2,0,0,0]
// output = true
public class binarySearch_Problem05 {
	static boolean indexTarget(int[] arr , int target)
	{
		int n = arr.length;
		int st = 0,end = n-1;
		while(st<=end)
		{
			int mid = st + (end - st)/2;
			if(arr[mid] == target) return true;
			else if(arr[st] == arr[mid] && arr[end]== arr[mid])
			{
				st++;
				end++;
			}
			else if(arr[mid]<=arr[end]) //mid to end sorted
			{
				if(target > arr[mid] && target <= arr[end])
				{
					st = mid + 1;
				}
				else 
				{
					end = mid -1;
				}
			}
			else
			{
				if(target >= arr[st] && target < arr[mid])
				{
					end = mid -1 ;
				}
				else 
				{
					st = mid + 1;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {0,0,0,1,1,1,2,0,0,0};
		int target = 2;
		boolean a = indexTarget(arr,target);
		System.out.println(a);
	}
}
