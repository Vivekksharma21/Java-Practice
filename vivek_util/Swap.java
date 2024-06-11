package vivek_util;

public class Swap {
   public void swapping(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
    
   public void swapping_twod(int[][] arr,int i,int j)
   {
       int temp = arr[i][j];
       arr[i][j] = arr[j][i]; 
       arr[j][i] = temp;
   }
   
}
