//For a given integer array of size N. You have to find all the occurrences
//(indices) of a given element (Key) and print them. Use a recursive function to solve this
//problem.
//Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
//Sample Output : 1 5 7 8
public class Recursion15_occurenceindexs {
	static void indexs(int[] arr,int key,int index)
	{
	    if(index == arr.length)
		{
			return;
		}
		if(arr[index]== key)
		{
			System.out.println(index + " ");
		}
		indexs(arr,key,index+1);
	}
	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
		indexs(arr,2,0);
	}
}
