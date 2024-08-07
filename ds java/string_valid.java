import java.util.Stack;

public class string_valid 
{

    public static boolean isStringValid(String str) 
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) 
        {
            char c = str.charAt(i);

            if (c == 'a') 
            {
                stack.push(c);
            } 
            else if (c == 'b') 
            {
                if (stack.isEmpty() || stack.pop() != 'a') 
                {
                    return false;
                }
            } 
            else 
            {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) 
    {
        System.out.println("Enter a string: ");
        String str = System.console().readLine();

        if (isStringValid(str)) 
        {
            System.out.println("The string is valid.");
        } 
        else 
        {
            System.out.println("The string is not valid.");
        }
    }
}