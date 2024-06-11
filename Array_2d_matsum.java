import java.util.*;

class function {
    Scanner sc = new Scanner(System.in);

    void input(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void display(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void matsum(int arr[][],int brr[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] += brr[i][j];
            }
        }
    }
}

public class Array_2d_matsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        function obj = new function();
        System.out.println("Enter details of first array....");
        System.out.println("Enter row size : ");
        int row = sc.nextInt();
        System.out.println("Enter column size : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter "+row+" * "+col+" matrix element : ");
        obj.input(arr,row,col);

        System.out.println("Enter details of second array....");
        System.out.println("Enter row size : ");
        int row1 = sc.nextInt();
        System.out.println("Enter column size : ");
        int col1 = sc.nextInt();

        int[][] brr = new int[row1][col1];
        System.out.println("Enter "+row1+" * "+col1+" matrix element : ");
        obj.input(brr,row1,col1);

        if(row == row1 && col == col1)
        {
            System.out.println("Displaying first array : ");
            obj.display(arr,row,col);
            System.out.println("Displaying second array : ");
            obj.display(brr,row,col);
            obj.matsum(arr,brr,row,col);
            System.out.println("After sum of above two matrix : ");
            obj.display(arr,row,col);
        }
        else
        {
            System.out.println("Above matrix size is not valid .... ");
        }
        sc.close();
    }
}

// O/P

// Enter details of first array....
// Enter row size :
// 3
// Enter column size :
// 3
// Enter 3 * 3 matrix element :
// 10 20 30
// 40 50 60
// 70 80 90
// Enter details of second array....
// Enter row size :
// 3
// Enter column size :
// 3
// Enter 3 * 3 matrix element :
// 1 2 3

// 4 5 6
// 7 8 9
// Displaying first array :
// 10 20 30
// 40 50 60
// 70 80 90
// Displaying second array :
// 1 2 3
// 4 5 6
// 7 8 9
// After sum of above two matrix :
// 11 22 33
// 44 55 66
// 77 88 99