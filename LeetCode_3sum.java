import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int j=i+1 , k = nums.length -1;
            
            while(j<k)
            {
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0)
            {
                list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while(j<k && nums[j] == nums[j+1])
                {
                    j++;
                }
                while(j<k && nums[k] == nums[k-1])
                {
                    k--;
                }
                j++;
                k--;
            }
            else if(sum<0)
            {
                j++;
            }
            else
            {
                k--;
            }
            }
        }
        return list;
    }
}
public class LeetCode_3sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int s = sc.nextInt();
        int[] arr = new int[s];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("List of three sums whose addition is 0:");
        List<List<Integer>> list = new Solution3sum().threeSum(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        sc.close();
    }
}


/// not run ;;;;;;;;;;;;;;


//Example 1:
//
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
//Explanation: 
//nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
//nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
//nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
//The distinct triplets are [-1,0,1] and [-1,-1,2].
//Notice that the order of the output and the order of the triplets does not matter.
//Example 2:
//
//Input: nums = [0,1,1]
//Output: []
//Explanation: The only possible triplet does not sum up to 0.
//Example 3:
//
//Input: nums = [0,0,0]
//Output: [[0,0,0]]
//Explanation: The only possible triplet sums up to 0.