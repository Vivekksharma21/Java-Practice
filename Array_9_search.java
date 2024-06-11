// search the given element x in the array . if present then return the index else return -1 
import java.util.*;
class Element_search{
    int search(int[] ar,int x)
    {
        int ans = -1;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==x)
            {
                ans = i;
                System.out.print(x+" found in the array and it's index is : "+ans);
                return ans;
            }
        }
        System.out.println(ans+" ,means "+ x + " not found in the array");
        return ans;
    }
}
public class Array_9_search {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements of array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter seaching element : ");
        int find = sc.nextInt();
        Element_search obj = new Element_search();
        obj.search(arr,find);
        sc.close();
    }
}
