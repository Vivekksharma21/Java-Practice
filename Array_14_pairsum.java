// find the total number of pairs in the array whose sum is equal to given value x..
import java.util.*;
import vivek_util.*;
public class Array_14_pairsum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        System.out.println("Enter the target sum (x) : ");
        int x = sc.nextInt();
        int[] arr = new int[size];
        arrayInputDisplay obj = new arrayInputDisplay();
        obj.arrayInput(arr,size);
        int count =0;
        obj.arrDisplay(arr,size);
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]+arr[j]==x)
                {
                   count++;
                }
            }
        }
        System.out.println("\nTotal number of pairs with sum equal to : " + count);
        sc.close();
    }
}
