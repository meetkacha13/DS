//simple linked list structure
import java.util.*;

class node
{
	int data;
	node link;

	node(int x)
	{
		this.data=x;
		this.link=null;
	}
}

public class linked_list
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter data : ");
		int x = s.nextInt();
		node n = new node(x);
	}
}