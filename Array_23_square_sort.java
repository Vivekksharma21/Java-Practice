import java.util.*;
import vivek_util.*;
class square_sort{
	static void swapping(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
	
	static void square(int[] arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			arr[i] = Math.abs(arr[i]) * Math.abs(arr[i]);
		}
	}
//	static void sort(int[] arr)
//	{
//		int i=0;
//		int j = arr.length;
//		while(i<j)
//		{
//			swapping(arr,i,j);
//			i++;
//			j--;
//		}
//	}
	public void arrDisplay(int[] arr, int size) {
      square(arr, size);
      Arrays.sort(arr);

      System.out.println("Displaying array : ");
      for (int i = 0; i < size; i++) {
          System.out.print(arr[i] + " ");
      }
  }
}
public class Array_23_square_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		arrayInputDisplay obj = new arrayInputDisplay();
		obj.arrayInput(arr, size);
		
		square_sort obj1 = new square_sort();
		obj1.arrDisplay(arr,size);
		sc.close();
	}
}

//import java.util.*;
//import vivek_util.*;
//
//class SquareSort {
//    static void square(int[] arr, int size) {
//        for (int i = 0; i < size; i++) {
//            arr[i] = arr[i] * arr[i];
//        }
//    }
//
//    public static void arrDisplay(int[] arr, int size) {
//        square(arr, size);
//        Arrays.sort(arr);
//
//        System.out.println("Displaying array : ");
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
//
//public class Array_23_square_sort {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array : ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        arrayInputDisplay obj = new arrayInputDisplay();
//        obj.arrayInput(arr, size);
//
//        SquareSort.arrDisplay(arr, size);
//        sc.close();
//    }
//}

