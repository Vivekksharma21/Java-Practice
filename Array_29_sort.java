import java.util.Scanner;
import vivek_util.Swap;
import vivek_util.arrayInputDisplay;
class matrixfunc{
	
}
public class Array_29_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrayInputDisplay obj = new arrayInputDisplay();
		Swap obj2 = new Swap();
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		obj.arrayInput(arr, size);
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					obj2.swapping(arr, i, j);
				}
			}
		}
		obj.arrDisplay(arr, size);
	}
}
