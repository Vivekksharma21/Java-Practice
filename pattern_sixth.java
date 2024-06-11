/*    *  *  *  *  *
      *  *  *  *  *
      *  *  *  *  *
      *  *  *  *  *        */
import java.util.*;
public class pattern_sixth
{
    public static void main(String args[])
    {
        int row ;
        int column ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        row = ref.nextInt();

        System.out.print("Enter coulmn size : ");
        column = ref.nextInt();
        // outer loop 
        for (int i=1;i<=row;i++)
        {
            // inner loop
            for(int j=1;j<=column;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}