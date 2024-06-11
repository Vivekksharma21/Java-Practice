import java.util.Scanner;

class Solutionpre {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}

public class LeetCode_Longestcommanprefix {
    public static void main(String[] args) {
        Solutionpre obj = new Solutionpre();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings separated by spaces: ");
        String input = sc.nextLine();
        String[] strs = input.split(" ");
        String result = obj.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
