package vivek_util;
import java.util.*;
public class TwoD_Input_Display {
	Scanner sc = new Scanner(System.in);
	public void TwoDinput(int[][] arr,int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public void TwoDdisplay(int[][] arr,int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
