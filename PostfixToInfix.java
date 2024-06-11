import java.util.Stack;

public class PostfixToInfix {
	public static boolean isOperator(char c)
	{
		return (c >= 'a' && c <= 'z')||(c>='A' && c <= 'Z');
	}
	public static String PostfixtoInfix(String exp)
	{
		int len = exp.length();
		Stack<String> st = new Stack<>();
		
		for(int i=0;i<len;i++)
		{
			char c = exp.charAt(i);
			
			if(isOperator(c))
			{
				st.push(c +"");
			}
			else
			{
				String str1 = st.pop();
				String str2 = st.pop();
				String temp = "(" + str2 + c + str1 + ")" ;
				st.push(temp);
			}
		}
		return st.pop();
	}
	public static void main(String args[])
	{
		String infix = PostfixtoInfix("ab+c+");
		System.out.println(infix);
	}
}
