import java.util.Scanner;

class Solution {
    public void romanToInt(String s) {
    	if (s == null || s.length() == 0) {
            System.out.println("Digits not possible...");;
        }
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i] = s.charAt(i);
        }
        int numm = 0;
        for(int i=0;i<s.length();i++)
        {
            numm += num(arr[i]);
        }
        System.out.println(numm);
    }
    static int num(char rom)
    {
    	switch (rom) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
    }
    }
}
public class LeetCode_roman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roman values : ");
		String s = sc.next();
		Solution obj = new Solution();
		System.out.println("Roman values are converted in digits : ");
		obj.romanToInt(s);
	}
}
