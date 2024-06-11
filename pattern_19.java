/*
            *      *   ]
            **    **   ]   upper half
            ***  ***   ]
            ********   ]
            ********   |
            ***  ***   |  lower half
            **    **   |
            *      *   |

 */
import java.util.*;
public class pattern_19 
{
    public static void main(String args[])
    {
        int row ;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter size of row : ");
        row = ref.nextInt();

        // upper half
        for(int i=1;i<=row;i++)
        {

            // 1st part 
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");   // print  star *  at left side 
            }

            // space 
            // for space = 2*(row-i);
            for(int k=1;k<=2*(row-i);k++)
            {
                System.out.print(" ");   /// print space 
            }

            // 2nd part 
            for(int l=i;l>=1;l--)
            {
                System.out.print("*");   // print star * at right side 
            }
            System.out.println();
        }

        // lower half
        for(int i=row;i>=1;i--)
        {
            // 1st part 
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            // space 
            for(int k=1;k<=2*(row-i);k++)
            {
                System.out.print(" ");
            }

            // 2nd part 
            for(int l=i;l>=1;l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
