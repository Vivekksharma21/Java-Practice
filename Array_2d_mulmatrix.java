import java.util.*;
import vivek_util.*;
class Matrixxfunc{
	//TwoD_Input_Display obj = new TwoD_Input_Display();
	void mulmat(int[][] arr,int[][] brr,int r1,int c2,int r2)
	{
		int[][] mul = new int[r1][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<r2;k++)
				{
					mul[i][j] += arr[i][k] * brr[k][j];
				}
			}
		}
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(mul[i][j]+" ");
				}
				System.out.println();
			}
	}
		
}
public class Array_2d_mulmatrix {
	public static void main(String[] args) {
		TwoD_Input_Display obj = new TwoD_Input_Display();
		Matrixxfunc obj1 = new Matrixxfunc();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first array details : ");
		System.out.println("Enter row size : ");
		int r1 = sc.nextInt();
	    System.out.println("Enter column size : ");
	    int c1 = sc.nextInt();
	    int[][] arr = new int[r1][c1];
	    System.out.println("Enter value for array one : ");
	    obj.TwoDinput(arr, r1, c1);
	    
		System.out.println("Enter second array details : ");
		System.out.println("Enter row size : ");
		int r2 = sc.nextInt();
	    System.out.println("Enter column size : ");
	    int c2 = sc.nextInt();
	    int[][] brr = new int[r2][c2];
	    System.out.println("Enter second matrix values : ");
	    obj.TwoDinput(brr, r2, c2);
	    
	    System.out.println("First matrix is : ");
	    obj.TwoDdisplay(arr, r1, c1);
	    System.out.println("Second matrix is : ");
	    obj.TwoDdisplay(brr, r2, c2);
	    
	    System.out.println("Multiplication of matrix will be : ");
	    obj1.mulmat(arr, brr, r1, c2, r2);
	    sc.close();
	}
}
