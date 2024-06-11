// find the total number of triplets in the array whose sum is equal to given value x..
import java.util.*;
import vivek_util.*;
public class Array_15_tripletsum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target sum (x) : ");
        int x = sc.nextInt();
        System.out.println("Enter array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        arrayInputDisplay obj = new arrayInputDisplay();
        obj.arrayInput(arr,size);
        obj.arrDisplay(arr,size);
        int count =0;
        for(int i=0;i<=size-1;i++)
        {
            for(int j=i+1;j<=size-1;j++)
            {
                for(int k=i+2;k<=size-1;k++)
                {
                if(arr[i]+arr[j]+arr[k]==x)
                {
                   count++;
                }
               }
            }
        }
        System.out.println("\nTotal number of pairs with sum equal to " + x + ": " + count);
        sc.close();
    }
}
