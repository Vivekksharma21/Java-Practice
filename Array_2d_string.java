import java.util.*;

class func {
    Scanner sc = new Scanner(System.in);

    public void input(String[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter value for ("+i+","+j+ ") : ");
                arr[i][j] = sc.next();
            }
        }
    }

    public void display(String arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // arr[i][j] = arr[i][j].replaceAll("[0-9]","");  // we can also write like this ... in this those values are remove which belongs to 0-9
                arr[i][j]= arr[i][j].replaceAll("[^A-Z]", ""); //[^A - Z] THIS MEANS PRINT ONLY THOSE CHAR WHICH BELONGS TO A - Z 
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
public class Array_2d_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        func obj = new func();
        System.out.println("Enter details of first array....");
        System.out.println("Enter row size : ");
        int row = sc.nextInt();
        System.out.println("Enter column size : ");
        int col = sc.nextInt();

        String[][] arr = new String[row][col];    
        obj.input(arr,row,col);
        System.out.println("Displaying original array : ");
        obj.display(arr,row,col);
        sc.close();
}
}

// o/p 
// Enter details of first array....
// Enter row size :
// 3
// Enter column size :
// 3
// Enter value for (0,0) : H4ELL8O
// Enter value for (0,1) : H9I8
// Enter value for (0,2) : J5O6E
// Enter value for (1,0) : W6O5R6L3D
// Enter value for (1,1) : G8I3E9T
// Enter value for (1,2) : K5I54N7G
// Enter value for (2,0) : K5E34E8P
// Enter value for (2,1) : V87I98V33E8K
// Enter value for (2,2) : B78Y3E4
// 
//Displaying original array :
// HELLO HI JOE 
// WORLD GIET KING
// KEEP VIVEK BYE