import java.util.*;
public class prime_fifth
{
    public static void main(String args[])
    {
        int n ;
        int count =0;
        System.out.print("Enter a number : ");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               count++;
            }
        }
        if(count==2)
        {
            System.out.println(n+" is a Prime number");
        }
        else
        {
            System.out.println(n+" is not a prime number ");
        }
        ref.close();
    }
}