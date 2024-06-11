// make a function to check if a number is prime or not 

import java.util.*;
public class Function_3
{
    public static void Isprime(int x)
    {
        int count = 0;
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                count = count + 1;
            }
        }
        if(count==2)
        {
            System.out.print(x+" is a prime number..");
        }
        else
        {
            System.out.print(x+" is not a prime number..");
        }
        return ;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a  = sc.nextInt();

        Isprime(a);
    }
}