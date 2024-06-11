import java.util.*;
import vivek_util.*;
class SumRectangle
{
	void LoginSum(int[][] matrix , int l1,int l2,int r1,int r2 )
	{
		int sum =0;
		for(int i=l1;i<=l2;i++)
		{
			for(int j=r1;j<=r2;j++)
			{
				sum += matrix[i][j];
			}
		}
		System.out.println("The sum of the matrix/rectangle from(l1,r1) to (l2,r2) is : "+sum);
	}
}
public class Arrays_2d_sumrec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoD_Input_Display obj1 = new TwoD_Input_Display();
		SumRectangle obj2 = new SumRectangle();
		
		System.out.println("Enter the size of row : ");
		int r = sc.nextInt();
		System.out.println("Enter the of column : ");
		int c = sc.nextInt();
		int[][] matrix = new int[r][c];
		System.out.println("Enter elements for "+r+" * "+c+" matrix : ");
		obj1.TwoDinput(matrix, r, c);
		System.out.println("Displaying matrix : ");
		obj1.TwoDdisplay(matrix, r, c);
		
		System.out.println("Enter value of l1 and r1 : ");
		int l1 = sc.nextInt();
		int r1 = sc.nextInt();
		System.out.println("Enter value of l2 and r2 : ");
		int l2 = sc.nextInt();
		int r2 = sc.nextInt();
		obj2.LoginSum(matrix, l1, l2, r1, r2);
	}
}
