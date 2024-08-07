//insert value in linked list


//incomplete

class node
{
	int data;
	node link;

	node(int x)
	{
		this.data=x;
		this.link=null;
		System.out.println(x);
	}
}

class linked_list
{
	node first=null;
	node save;
	public int insert(int x)
	{
		node n = new node(x);

		if (first==null) 
		{
			first = n;
			n.link=null;
		}
		else
		{
			n.link=null;
			save=first;
			while(save.link!=null)
			{
				save = save.link;
			}
			save.link=n;
		}
		return x;
	}

	public int insertAtStart(int x)
	{
		node n = new node(x);

		if (first==null) 
		{
			first = n;
			n.link=null;
		}
		else
		{
			n.link=first;
			save=first;
			while(save.link!=null)
			{
				save = save.link;
			}
			save.link=null;
		}
		return x;
	}

	public void display()
	{
		save=first;
		while(save.link!=null)
		{
			System.out.println("data = "+save.data);
			save = save.link;
		}
		System.out.println("data = "+save.data);
	}
}
public class linked_list_insert
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		/*System.out.println("enter data : ");
		int x = s.nextInt();
		node n = new node(x);*/
		linked_list ll = new linked_list();
		ll.insert(5);
		ll.insert(10);
		ll.insert(15);
		ll.insertAtStart(1);
		ll.display();
	}
}