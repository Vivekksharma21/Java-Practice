import java.util.Arrays;

public class leetcode_medianarray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;
        int[] merged = new int[c];

        // Merge the two arrays into one sorted array
        int i = 0, j = 0, k = 0;
        while (i < a && j < b) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < a) {
            merged[k++] = nums1[i++];
        }
        while (j < b) {
            merged[k++] = nums2[j++];
        }

        if (c % 2 == 1) {
            // If the merged array has odd length, return the middle element
            return (double) merged[c / 2];
        } else {
            // If the merged array has even length, return the average of the two middle elements
            int middle1 = merged[c / 2 - 1];
            int middle2 = merged[c / 2];
            return (double) (middle1 + middle2) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        leetcode_medianarray solution = new leetcode_medianarray();
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
