import java.util.*;
import vivek_util.*;
class Spiralfunc{
	void spirallogic(int[][] matrix ,int r,int c)
	{
		int toprow=0 , bottomrow = r-1 , rightcol = c-1 , leftcol = 0;
		int totalelement = 0 ;
		
		while(totalelement < r*c)
		{
			// toprow -> leftcol to rightcol
			
			for(int j=leftcol;j<=rightcol && totalelement<r*c ;j++)
			{
				System.out.print(matrix[toprow][j]+ " ");
				totalelement++;
			}
			toprow++;
			
			// rightcol -> toprow to bottomrow
			
			for(int i=toprow;i<=bottomrow && totalelement < r*c ;i++)
			{
				System.out.print(matrix[i][rightcol]+ " ");
				totalelement++;
			}
			rightcol--;
			
			// bottomrow -> rightcol to leftcol
			
			for(int j=rightcol;j>=leftcol && totalelement < r*c ;j--)
			{
				System.out.print(matrix[bottomrow][j]+" ");
				totalelement++;
			}
			bottomrow--;
			
			// leftrow -> bottomrow to toprow
			for(int i=bottomrow;i>=toprow && totalelement < r*c ;i--)
			{
				System.out.print(matrix[i][leftcol]+" ");
				totalelement++;
			}
			leftcol++;
		}
	}
}
public class Array_2d_Spiral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoD_Input_Display obj1 = new TwoD_Input_Display();
		Spiralfunc obj2 = new Spiralfunc();
		
		System.out.println("Enter size of row : ");
		int r = sc.nextInt();
		System.out.println("Enter size of column : ");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		System.out.println("Enter "+r+" * "+c+" matrix elements : ");
		obj1.TwoDinput(matrix, r, c);
		System.out.println("Original array is : ");
		obj1.TwoDdisplay(matrix, r, c);
		System.out.println("After apply spiral logic output is : ");
		obj2.spirallogic(matrix, r, c);
	}
}
