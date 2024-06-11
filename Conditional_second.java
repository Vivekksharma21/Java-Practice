import java.util.*; 
public class Conditional_second 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = s.nextInt();
        System.out.println("Enter second number : ");
        int b = s.nextInt();
        
        System.out.print("Enter 1 or 2 or 3 or 4 or 5 : ");
        int c = s.nextInt();
        switch(c)
        {
            case 1 : System.out.println("Addition is : "+ (a+b));
            break;

            case 2 : System.out.println("Subtraction is : "+(a-b));
            break;

            case 3 : System.out.println("Division is : "+(a/b));
            break ;

            case 4 : System.out.println("Multiplication is : "+ (a*b));
            break;

            case 5 : System.out.println("Modulo is : "+(a%b));
            break;
            
            default : System.out.println("Error");
        }
        s.close();

    }
}
