import java.util.*;
public class Function_1
{
    public static int Calculatesum(int x , int y)
    {
        int add = x + y;
        return add;
    }
    public static void main(String args[])
    {
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = ref.nextInt();

        System.out.print("Enter second number : ");
        int b = ref.nextInt();

        int sum =Calculatesum(a,b);
        System.out.print("After addition result is : "+sum);
    }
}