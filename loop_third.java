import java.util.*;
public class loop_third 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Natural upto "+a+"is : ");
        int sum =0;
        for(int i=0;i<=a;i++)
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("First"+a+"natural number sum is : "+sum);

    }
}
