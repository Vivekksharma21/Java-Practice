// Print all binary strings of size of N without consecutive ones.. 
public class Recursion14_BinaryString {
	public static void printBinary(int n , int lastplace, String str)
	{
		// base case
		if(n==0) { System.out.println(str); return ;}
		printBinary(n-1,0,str+"0");
		if(lastplace==0)
		{
			printBinary(n-1,1,str+"1");
		}
	}
	public static void main(String[] args) {
		printBinary(3,0," ");
	}
}