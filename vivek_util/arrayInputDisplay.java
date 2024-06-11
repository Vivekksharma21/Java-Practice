package vivek_util;
import java.util.*;
public class arrayInputDisplay {
    public void arrayInput(int[] arr,int size)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        //sc.close();
    }
    public void arrDisplay(int[] arr,int size)
    {
        System.out.println("Displaying array : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
