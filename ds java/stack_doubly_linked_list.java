//doubly linked list

//incomplete
//error in output in pop function / push function

import java.util.*;

class node
{
	int data;
	node lptr;
	node rptr;

	node(int x)
	{
		this.data=x;
		this.lptr=null;
		this.rptr=null;
	}
}

class stackll
{
	node l=null;
	node r=null;
	node temp;

	public void push(int x)
	{
		node n = new node(x);
		n.lptr=l;
		n.rptr=r;
		
		if (r==null) 
		{
			l=n;
			r=n;
		}
		else
		{
			r.link=n;
			r=n;
		}
	}

	public int pop()
	{
		int x = r.data;
		r=r.lptr;
		System.out.println(r);
		return x;
	}

	public void display()
	{
		temp=l;
		while(temp.rptr!=null)
		{
			System.out.println("data = "+temp.data);
			temp = temp.rptr;
		}
		System.out.println("data = "+temp.data);
	}
}

class stack_doubly_linked_list
{
	public static void main(String[] args) 
	{
		stackll s = new stackll();
		s.push(10);
		s.push(20);
		s.pop();
		s.push(30);
		s.push(40);
		s.push(50);
		s.pop();
		s.push(60);
		s.display();
	}
}