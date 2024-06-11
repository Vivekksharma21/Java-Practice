
import java.util.Scanner;

class functionn{
    Scanner sc = new Scanner(System.in);

    void input(String[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value for ("+i+","+j+ ") : ");
                arr[i][j] = sc.next();
            }
        }
    }

   void display(String arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
   static void displayop(int arr[][], int row, int col) {
       for (int i = 0; i < row; i++) {
           for (int j = 0; j < col; j++) {
               System.out.print(arr[i][j]+ " ");
           }
           System.out.println();
       }
   }
    void check(String arr[][],String arr1[][],int row, int col)
    {
    	int ans[][] = new int[row][col];
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
    			if(arr[i][j].equals(arr1[i][j]))
    			{
    				ans[i][j]= 0;
    			}
    			else
    			{
    				ans[i][j] = 1;
    			}
    		}
    	}
    	System.out.println("Displaying output : ");
    	displayop(ans,row,col);
    }
}
public class Array_2d_qual{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        functionn obj = new functionn();
        System.out.println("Enter details of first array....");
        System.out.println("Enter row size : ");
        int row = sc.nextInt();
        System.out.println("Enter column size : ");
        int col = sc.nextInt();

        String[][] arr = new String[row][col];    
        obj.input(arr,row,col);
        System.out.println("Displaying first array : ");
        obj.display(arr,row,col);
        
        System.out.println("Enter details of second array....");
        System.out.println("Enter row size : ");
        int row1 = sc.nextInt();
        System.out.println("Enter column size : ");
        int col1 = sc.nextInt();

        if(row==row1 && col==col1)
        {
            String[][] arr1 = new String[row1][col1];    
            obj.input(arr1,row1,col1);
            System.out.println("Displaying second array : ");
            obj.display(arr1,row1,col1);
            obj.check(arr, arr1, row1, col1);
        }
        else
        {
        	System.out.println("Second matrix size should same as first matrix..");
        }
        sc.close();
}
}
