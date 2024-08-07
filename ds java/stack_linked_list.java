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

class stackll
{
	node top;
	node temp;

	public void push(int x)
	{
		node n = new node(x);
		n.link=top;
		top=n;
	}

	public int pop()
	{
		int x = top.data;
		top=top.link;
		return x;
	}

	public void display()
	{
		temp=top;
		while(temp.link!=null)
		{
			System.out.println("data = "+temp.data);
			temp = temp.link;
		}
		System.out.println("data = "+temp.data);
	}
}

class stack_linked_list
{
	public static void main(String[] args) 
	{
		stackll s = new stackll();
		s.push(10);
		s.push(20);
		s.pop();
		s.push(30);
		s.display();
	}
}