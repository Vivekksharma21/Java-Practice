// Find the second largest element in the given array...
import java.util.*;
import vivek_util.*;
class secondlargest{
    int largest(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
public class Array_17_secondlargest {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        arrayInputDisplay obj1 = new arrayInputDisplay();
        obj1.arrayInput(arr,size);
        
        obj1.arrDisplay(arr,size);

        secondlargest obj = new secondlargest();
        for(int i=0;i<arr.length;i++)
        {
            int max = obj.largest(arr);
            if(arr[i]==max)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int seclargest = obj.largest(arr);
        System.out.println("Second largest element is : "+seclargest);
        sc.close();
    }   
}
