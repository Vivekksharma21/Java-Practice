import java.util.*;
public class HackerRank_Anagram {
	public static void main(String[] args) {
		boolean status = true; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1 : ");
		String str1 = sc.next();
		
		System.out.println("Enter string 2 : ");
		String str2 = sc.next();
		
//		int str3 = str1.length();
//		int str4 = str2.length();
		if(str2.length() != str1.length())
		{
			System.out.println("Not a Anagram");
		}
		else
		{
			char[] arraystr1 = str1.toLowerCase().toCharArray();
			char[] arraystr2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(arraystr1);
			Arrays.sort(arraystr2);
			
		    status = Arrays.equals(arraystr1, arraystr2);
		    if(status)
		    {
		    	System.out.println("Anagram");
		    }
		    else
		    {
		    	System.out.println("Not an Anagram");
		    }
		}
	}
}
