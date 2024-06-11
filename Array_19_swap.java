// reverse an array consisting of integer values...
import java.util.*;
import vivek_util.*;
public class Array_19_swap {
    static void swapping(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
    static void reverse(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            swapping(arr,i,j);
            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        arrayInputDisplay obj1 = new arrayInputDisplay();
        obj1.arrayInput(arr,size);
        obj1.arrDisplay(arr,size);
        reverse(arr);
        obj1.arrDisplay(arr,size);
        sc.close();
    }
}
