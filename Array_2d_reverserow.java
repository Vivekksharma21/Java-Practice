import java.util.*;
import vivek_util.*;
public class Array_2d_reverserow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoD_Input_Display obj = new TwoD_Input_Display();
		
		System.out.println("Enter size of row : ");
		int row = sc.nextInt();
		System.out.println("Enter size of column : ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter array elements : ");
		obj.TwoDinput(arr, row, col);
		
		for(int i=0;i<row;i++)
		{
			int start = 0;
			int end = col -1;
			while(start<end)
			{
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
			}
			start++;
			end--;
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		obj.TwoDdisplay(arr, row, col);
	}
}
