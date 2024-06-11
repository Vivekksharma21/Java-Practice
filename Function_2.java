// wap to find Factorial  using function 


import java.util.*;
public class Function_2
{
    public static void CalculateFactorial(int x)
    {
        if(x<=0)
        {
            System.out.println("..Ivalid number..");
            return ;
        }

        int fac = 1;
        for(int i=x;i>=1;i--)
        {
            fac = fac * i ;
        }
        System.out.print("Factorial of "+x+" is : "+fac);
        return ;
    }
    public static void main(String args[])
    {
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = ref.nextInt();

        CalculateFactorial(a);
    

    }
}