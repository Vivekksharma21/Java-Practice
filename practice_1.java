// count the numbers 
import java.util.*;
public class practice_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("Total numbers are : "+count);
    }
}
