import java.util.*;
import vivek_util.*;
class RotateFunc{
	static Swap swap = new Swap();
	static void transposeLogic(int[][] matrix,int r,int c)
	{
		for(int i=0;i<c;i++)
		{
			for(int j=i;j<r;j++)
			{
				swap.swapping_twod(matrix, i, j);
			}
		}
	}
	static void reverseArray(int[] arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	void rotateLogic(int[][] matrix,int r,int c)
	{
		transposeLogic(matrix,r,c);
		//int[][] rotate = new int[r][c];
		for(int i=0;i<c;i++)
		{
			reverseArray(matrix[i]);
		}
	}
}
public class Array_2d_rotateMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoD_Input_Display obj = new TwoD_Input_Display();
		RotateFunc obj1 = new RotateFunc();
		System.out.println("Enter row size : ");
		int row = sc.nextInt();
		System.out.println("Enter column size : ");
		int col = sc.nextInt();
		int[][] matrix = new int[row][col];
		System.out.println("Enter matrix vlaues : ");
		obj.TwoDinput(matrix, row, col);
		obj1.rotateLogic(matrix, row, col);
		System.out.println("After rotation : ");
		obj.TwoDdisplay(matrix, row, col);
	}
}
