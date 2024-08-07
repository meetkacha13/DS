import java.util.*;
import java.util.Stack;

public class intopre_value
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter numbers : ");
		String input = s.next();
		
        intopost_value ipv = new intopost_value();
		System.out.println("postfix : "+ipv.infixtopostvalue(input));
	}

	public int infixtoprefixvalue(String input)
	{
		Stack<Integer> no = new Stack<Integer>();
		int output;
		for (int i=0;i<input.length();i++) 
		{
			char value = input.charAt(i);
			
			if (value=='+'||value=='-'||value=='*'||value=='/'||value=='%') 
			{
				int p1=no.pop();
				int p2=no.pop();
                int p3;
				switch(value)
				{
					case '+':
						p3=p1+p2;
						no.push(p3);
						break;
					case '-':
						p3=p1-p2;
						no.push(p3);
						break;
					case '*':
						p3=p1*p2;
						no.push(p3);
						break;
					case '/':
						p3=p1/p2;
						no.push(p3);
						break;
					case '%':
						p3=p1%p2;
						no.push(p3);
						break;
				}
			}
			else
			{
				int temp = input.charAt(i)-'0';
				no.push(temp);
				System.out.println(no.peek());
			}
		}
		return no.peek();
	}
}