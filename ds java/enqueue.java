import java.util.*;

class queue
{
	int size;
	int a[];
	int front;
	int rear;

	queue(int n)
	{
		size=n;
		a=new int[n];
		front=-1;
		rear=-1;
	}

	public void in(int x)
	{
		if (rear>size-1) 
		{
			System.out.println("queue underflow");
		}
		else
		{
			if (front==-1) 
			{
				front++;
			}
			rear++;
			a[rear]=x;
		}
	}

	public void de()
	{
		int temp;
		if (front == -1) 
		{
			System.out.println("queue overflow");
		}
		else
		{
			if (front==rear) 
			{
				front = 0;
				rear=0;
			}
			
			temp=a[front++];
		}
	}

	public void pri()
	{
		for (int i=front;i<=rear;i++) 
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
}
 class enqueue
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of queue : ");
		int n = s.nextInt();
		queue q = new queue(n);
		q.in(5);
		q.in(10);
		q.pri();
		q.de();
		q.pri();
	}
}