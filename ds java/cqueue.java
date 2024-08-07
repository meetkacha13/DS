import java.util.*;
import java.util.Scanner;

class queue
{
	int size;
	int a[];
	int front;
	int rear;
	int temp;

	queue(int n)
	{
		size=n;
		a = new int[n];
		front = -1;
		rear = -1;
	}

	public void insert(int x)
	{
		if (rear == (size-1)) 
		{
			rear = 0;
		}
		else 
		{
			rear = rear + 1;
		}

		if (front == rear) 
		{
			System.out.println("queue overflow");
		}
		else
		{
			a[rear]=x;
			
			if (front == -1) 
			{
				front= 0;
			}
	  	}
	}

	public void delete()
	{
		if (front == -1) 
		{
			System.out.println("queue underflow");
			
		}
		else
		{
			temp = a[front];
		
			if (front == rear) 
			{
				front = rear = -1;
			}

			if (front == size) 
			{
				front = 0;
			}
			else
			{
				front++;
			}
			
		}
		
	}

	public void print()
	{ 
		if(front>=rear)
		{
			for (int i=front;i<size;i++) 
			{
				System.out.println( a[i]);
			}
			for (int i=0;i<=rear;i++) 
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			for (int i=front;i<rear;i++) 
			{
				System.out.println(a[i]);
			}

		}
	} 	
}

public class cqueue
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of queue : ");
		int n = s.nextInt();
		queue q = new queue(n);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.delete();
		q.delete();
		q.insert(40);
		q.insert(30);

		q.print();
	}
}