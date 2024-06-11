import java.util.Scanner;

import vivek_util.arrayInputDisplay;

class Solutionintersection {
    public void intersect(int[] nums1, int[] nums2) {
    	arrayInputDisplay obj1 = new arrayInputDisplay();
        int size = nums1.length + nums2.length;
        //System.out.println(size);
        int[] ans = new int[size];
        for(int i=0;i<=nums1.length-1;i++)
        {
            ans[i] = nums1[i]; 
        }
        int v=0;
        for(int i=nums1.length;i<=ans.length-1 && v <= nums2.length-1;i++)
        {
            ans[i] = nums2[v++];
        }
        obj1.arrDisplay(ans, size);
        System.out.println();
        System.out.println("Comman element is : ");
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=nums1.length;j<ans.length;j++)
            {
                if(ans[i]==ans[j]&& ans[i] !=-1 && ans[j] != -1 )
                {
                    System.out.print(ans[i]+" ");
                    ans[i] = ans[j] = -1;
                }
            }
        }
        return;
    }
}
public class LeetCode_intersection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arrayInputDisplay obj1 = new arrayInputDisplay();
		Solutionintersection obj2 = new Solutionintersection();
		System.out.println("Enter size of the first array : ");
		int s1 = sc.nextInt();
		int[] arr1 = new int[s1];
		obj1.arrayInput(arr1, s1);
		
		System.out.println("Enter size of the second array : ");
		int s2 = sc.nextInt();
		int[] arr2 = new int[s2];
		obj1.arrayInput(arr2, s2);
		obj2.intersect(arr1, arr2);
	}
}
