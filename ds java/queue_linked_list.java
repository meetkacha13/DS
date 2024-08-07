//queue linked list
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

class queuell
{
	node front=null;
	node rear=null;
	node temp;

	public void push(int x)
	{
		node n = new node(x);
		if (rear==null) 
		{
			front=n;
			rear=n;
		}
		else
		{
			rear.link=n;
			rear=n;
		}
	}

	public int pop()
	{
		if (front==null) 
		{
			System.out.println("queue is empty");
			return 0;
		}
		node n = front;
		front = front.link;

		if (front==null) 
		{
			rear=null;
		}
		return 0;
	}

	public void display()
	{
		node n =front;
		while(n!=null)
		{
			System.out.println("data = "+n.data);
			n = n.link;
		}
		/*System.out.println("data = "+temp.data);*/
	}
}

class queue_linked_list
{
	public static void main(String[] args) 
	{
		queuell q = new queuell();
		q.push(10);
		q.push(20);
		q.pop();
		q.push(30);
		q.pop();
		q.display();
	}
}