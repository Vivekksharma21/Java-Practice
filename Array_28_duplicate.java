//import java.util.*;
//import vivek_util.*;
//public class Array_28_duplicate {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		arrayInputDisplay obj = new arrayInputDisplay();
//		System.out.println("Enter the size of array : ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		obj.arrayInput(arr, size);
//		obj.arrDisplay(arr, size);
//		int count = 0;
//		for(int i=0;i<size;i++)
//		{
//			for(int j=i+1;j<size;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					//System.out.println("duplicate is : "+arr[i]);
//					arr[j]=0;
//					count++;
//					//break;
//				}
//				if(count>=1)
//				{
//					System.out.println("\nduplicate is : "+arr[i]);
//					count = 0;
//					break;
//				}
//			}
//		}
//		//obj.arrDisplay(arr, size);
//	}
//}

import java.util.*;
import vivek_util.*;

public class Array_28_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayInputDisplay obj = new arrayInputDisplay();
        
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        obj.arrayInput(arr, size);
        obj.arrDisplay(arr, size);
        
        System.out.println("\nDuplicate elements in the array: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j] && arr[i] != 0) {
                    System.out.println(arr[i]);
                    arr[j] = 0; // Mark the duplicate as 0 to avoid counting it again
                }
            }
        }
    }
}

