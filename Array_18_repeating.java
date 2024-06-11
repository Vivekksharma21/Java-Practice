// Given an array 'a' consisting of integers . Return the first value that is repeating in this array . If no vlaue is being repeated
// return -1..
import java.util.*;
import vivek_util.*;
public class Array_18_repeating {
    static int repeatingele(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("The first repeating value is : ");
                    return arr[i];
                }
            }
        }
        return -1;
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
        System.out.println("\n"+repeatingele(arr));
        sc.close();
    }
}
