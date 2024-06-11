import java.util.Scanner;
import vivek_util.*;
class transposefunc{
	Swap obj = new Swap();
	public void logicTranspose(int[][] matrix,int r, int c)
	{
		for(int i=0;i<c;i++)
		{
			for(int j=i;j<r;j++)
			{
				obj.swapping_twod(matrix,i,j);
			}
		}
	}
}
public class Array_2d_Transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoD_Input_Display obj1 = new TwoD_Input_Display();
		transposefunc obj2 = new transposefunc();
		System.out.println("Enter details of matrix...");
		System.out.println("Enter row size : ");
		int row = sc.nextInt();
		System.out.println("Enter column size : ");
		int col = sc.nextInt();
		int[][] matrix1 = new int[row][col];
		System.out.println("Enter matrix values : ");
		obj1.TwoDinput(matrix1, row, col);
		obj2.logicTranspose(matrix1,row,col);
		System.out.println("After transpose matrix is : ");
		obj1.TwoDdisplay(matrix1, row, col);
	}
}
