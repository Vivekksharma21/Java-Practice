// Rotate the given array 'a' by K steps , where k in non-negative... k can be greater than n as well..
import java.util.*;
import vivek_util.*;
public class Array_20_Rotate {
   static int[] rotate(int[] arr,int k)
   {
       int size = arr.length;
       k = k%size;
       int[] ans = new int[size];
       int j=0;
       for(int i=size-k;i<size;i++)
       {
           ans[j++] = arr[i];
       }
       for(int i=0;i<size-k;i++)  
       {
           ans[j++] = arr[i];
       }
    return ans;
   }
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array : ");
       int size = sc.nextInt();
       System.out.println("Enter steps value (k) : ");
       int k = sc.nextInt();

       int[] arr = new int[size];
       arrayInputDisplay obj = new arrayInputDisplay();
       obj.arrayInput(arr,size);
       obj.arrDisplay(arr,size);
       System.out.println("\nAfter rotation of "+k+" times : ");
       int[] ans = rotate(arr,k);
       obj.arrDisplay(ans,size);
       sc.close();
   }
}

//Enter size of array : 
// 7
// Enter steps value (k) :
// 5
// Enter array element :
// 1 2 3 4 5 6 7
// Displaying array :
// 1 2 3 4 5 6 7
// After rotation of 5 times :
// Displaying array :
// 3 4 5 6 7 1 2 


