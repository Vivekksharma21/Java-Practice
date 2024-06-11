// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// LeetCode 
import java.util.*;
class Twosum{
    void sum(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]+nums[i+1]==target)
            {
                System.out.print("[ "+i+" , "+(i+1)+" ]");
                break;
            }
        }
    }
}
public class Array_6_twosum{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+size+" of array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter target element : ");
        int x = scan.nextInt();

        Twosum obj = new Twosum();
        obj.sum(arr,x);
        scan.close();
    }
}