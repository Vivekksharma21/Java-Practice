// Given a positive integer n, generate a n*n matrix filled with elements 
// from 1 to n^2 in spiral order........
import java.util.*;
import vivek_util.*;
class Spiralfunction
{
	void logicsprial(int[][] matrix , int n)
	{
		int r=n, c =n;
		int toprow = 0 , rightcol = c-1 , bottomrow = r-1 , leftcol = 0;
		int totalelement = 0;
		int count =1;
		while(totalelement<n*n)
		{
			// toprow -> leftcol to rightcol
			
			for(int j=leftcol;j<=rightcol && totalelement <n*n;j++)
			{
				matrix[toprow][j] = count;
				//System.out.print(matrix[toprow][j]+" ");
				count++;
				totalelement++;
			}
			toprow++;
			
			// rightcol -> toprow to bottomrow 
			
			for(int i=toprow;i<=bottomrow && totalelement < n*n ;i++)
			{
				matrix[i][rightcol] = count;
				//System.out.print(matrix[i][rightcol]+" ");
				count++;
				totalelement++;
			}
			rightcol--;
			
			// bottomrow -> rightcol to leftcol
			
			for(int j=rightcol;j>=leftcol && totalelement <n*n;j--)
			{
				matrix[bottomrow][j] = count;
				//System.out.print(matrix[bottomrow][j]+" ");
				count++;
				totalelement++;
			}
			bottomrow--;
			
			// leftcol -> bottomrow to toprow
			
			for(int i=bottomrow;i>=toprow && totalelement < n*n;i--)
			{
				matrix[i][leftcol] = count;
				//System.out.print(matrix[i][leftcol]+" ");
				count++;
				totalelement++;
			}
			leftcol++;
		}
	}
}
public class Array_2d_Nsprial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoD_Input_Display obj2 = new TwoD_Input_Display();
		Spiralfunction obj1 = new Spiralfunction();
		
		System.out.println("Enter value of n : ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		obj1.logicsprial(matrix, n);
		System.out.println("After performing spiral order, spiral matrix is : ");
		obj2.TwoDdisplay(matrix, n, n);
		
	}
}
