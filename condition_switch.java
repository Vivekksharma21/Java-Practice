// MENU DRIVEN PROGRAMM.....
import java.util.*;
public class condition_switch {
   public static void main(String args[]){
    int a , b;
    String option;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter first number : ");
    a = scan.nextInt();
    System.out.print("Enter second number : ");
    b = scan.nextInt();
    scan.nextLine();
    System.out.print("Enter any of one 'ADD', 'SUB','MUL' : ");
    option = scan.nextLine();
    String optionn = option.toUpperCase();

    switch(optionn){
        case "ADD":  System.out.print("Addition of "+a+" and "+b+" is : "+(a+b));
        break;

        case "SUB": System.out.print("Subtraction of "+a+" and "+b+" is : "+(a-b));
        break;

        case "MUL": System.out.print("Multiplication of "+a+" and "+b+" is : "+(a*b));
        break;

        default : System.out.print("You entered wrong choice...");
    }
    scan.close();
   } 
}
