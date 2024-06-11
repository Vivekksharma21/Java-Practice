import java.util.*;
import vivek_util.*;
public class Symmetricpairs {
    static void pairs(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[j]-arr[i]) % 9==0)
                {
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        arrayInputDisplay obj = new arrayInputDisplay();
        obj.arrayInput(arr,size);
        obj.arrDisplay(arr,size);
        System.out.println("\nPairs are : ");
        pairs(arr);
        sc.close();
    }
}
