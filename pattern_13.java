/*
             12345
             1234
             123
             12
             1
 */
import java.util.*;
public class pattern_13 
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter row size : ");
        row = ref.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
