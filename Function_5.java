// make a function to print the table of a given number 
 
import java.util.*;
public class Function_5
{
    public static void Maketable(int x)
    {
        System.out.println(x+" table is : ");
        for(int i=1;i<=10;i++)
        {
            int table = x * i ;
            System.out.println(x+" * "+i+" = "+table);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        Maketable(a);
    }
}