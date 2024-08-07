import java.util.*;
import java.util.Stack;

public class infixpostfix
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter String : ");
		String input = s.nextLine();
		infixpostfix ip = new infixpostfix();
		System.out.println("postfix : ");
		System.out.println(ip.infixToPostfix(input));
	}

	public int precedence(char str)
	{
		if (str == '+' || str == '-') 
		{
			return 1;
		}
		else if (str == '*' || str =='/') 
		{
			return 2;
		}
		else if (str == '^') 
		{
			return 3;
		}
		else
		{
			return 0;
		}
	}

	public String infixToPostfix(String input)
	{
		// System.out.println(input);

		Stack<Character> st = new Stack<>();
		String output = "";
		// String v = input.charAt(i);
		for (int i=0;i<input.length();i++) 
		{
			char v = input.charAt(i);


			if (input.charAt(i)>='A' && input.charAt(i)<='Z' || input.charAt(i)>='a' && input.charAt(i)<='z' ) 
			{
				output =output+input.charAt(i);
		// System.out.println(output);


			}
			
				else if (input.charAt(i)== '(') 
				{
					st.push(v);
				}
				else if (input.charAt(i) == ')') 
				{
					while(st.peek()!='(')
					{
						output =output+ st.pop();
		System.out.println(output);


					}
					st.pop();
				}
				else
				{
					while(!st.isEmpty() && precedence(st.peek()) >= precedence(input.charAt(i)))
					{
						output =output+st.pop();
		System.out.println(output);

						
					}
					st.push(input.charAt(i));
				}
		// System.out.println(output);

			
		}

		while(!st.isEmpty())
		{
			output+=st.pop();
		}
		return output;
	}
}