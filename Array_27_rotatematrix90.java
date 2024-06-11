import java.util.*;
public class Array_27_rotatematrix90 {
	// below commented code rotate the matrix without making extra space...
//	static void transpose(int arr[][],int row,int col)
//	{
//		for(int i=0;i<row;i++)
//		{
//			for(int j=i;j<col;j++)
//			{
//				int temp = arr[i][j];
//				arr[i][j] = arr[j][i];
//				arr[j][i] = temp;
//			}
//		}
//	}
//	static void reverseColumns(int arr[][],int row,int col)
//	{
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col/2;j++)
//			{
//				int temp = arr[i][j];
//				arr[i][j] = arr[i][row - 1 - j];
//				arr[i][row - 1 -j] = temp;
//			}
//		}
//	}
//	static void rotatemat(int[][] arr,int row,int col)
//	{
//		transpose(arr,row,col);
//		reverseColumns(arr,row,col);
//	}
	////////////////////////////////////////////////////////////
	static void input(int[][] arr,int row,int col)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array inputs : ");
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		arr[i][j] = sc.nextInt();
        	}
        }
	}
	static void display(int[][] arr,int row,int col)
	{
		System.out.println("After rotation : ");
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}
	static int[][] rotate(int[][] arr,int row,int col)
	{
		int[][] rotate = new int[row][col];
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		rotate[j][row - i - 1] = arr[i][j];
        	}
        }
        return rotate;
	}

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row : ");
        int row = sc.nextInt();
        
        System.out.println("Enter size of column : ");
        int col = sc.nextInt();
        
        int[][] arr = new int[row][col];
        input(arr,row,col);
        int[][] rotatee = rotate(arr,row,col); 
        display(rotatee,row,col);
        
	}
}
