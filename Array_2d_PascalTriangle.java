import java.util.*;
class pascalLogic{
	void printmatrix(int[][] matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	int[][] pascal(int row)
	{
		int[][] arr = new int[row][];
		for(int i=0;i<row;i++)
		{
			arr[i] = new int[i+1];
			arr[i][0] = arr[i][i] = 1;
			for(int j=1;j<i;j++)
			{
				arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			}
		}
		return arr;
	}
}
public class Array_2d_PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pascalLogic obj = new pascalLogic();
		System.out.println("Enter row size : ");
		int row = sc.nextInt();
		int[][] ans = obj.pascal(row);
		System.out.println("Displaying : ");
		obj.printmatrix(ans);
	}
}
