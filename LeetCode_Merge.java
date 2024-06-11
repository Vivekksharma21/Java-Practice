import java.util.Arrays;
import java.util.Scanner;
import vivek_util.arrayInputDisplay;

class Solutionmerge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        arrayInputDisplay obj1 = new arrayInputDisplay();
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;
//        while (i < m && j < n) {
//            if (nums1[i] < nums2[j]) {
//                ans[k] = nums1[i];
//                i++;
//            } else {
//                ans[k] = nums2[j];
//                j++;
//            }
//            k++;
//        }
        while (i < m) {
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            ans[k] = nums2[j];
            j++;
            k++;
        }
        Arrays.sort(ans);
        // Display the merged array
        obj1.arrDisplay(ans, ans.length);
    }
    
}

public class LeetCode_Merge {
    public static void main(String[] args) {
    	try {
    		
        Scanner sc = new Scanner(System.in);
        arrayInputDisplay obj1 = new arrayInputDisplay();
        Solutionmerge obj2 = new Solutionmerge();
        System.out.println("Enter size of first array");
        int s1 = sc.nextInt();
        int[] nums1 = new int[s1];
        obj1.arrayInput(nums1, s1);
        
        System.out.println("Enter size of second array");
        int s2 = sc.nextInt();
        int[] nums2 = new int[s2];
        obj1.arrayInput(nums2, s2);

        obj2.merge(nums1, s1, nums2, s2);
    }catch(Exception e)
    	{
    	System.out.println(e);
    	}
    }
}
