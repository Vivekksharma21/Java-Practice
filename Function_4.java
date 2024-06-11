// make a function to check given number is even or not 
import java.util.*;
public class Function_4
{
    public static void Iseven(int x)
    {
        if(x%2==0)
        {
            System.out.print(x+" is a even number..");
        }
        else
        {
            System.out.print(x+" is not a even number..");
        }
        return ;

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
   
        Iseven(a);
    }
}
