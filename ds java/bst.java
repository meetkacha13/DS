//binary search tree
import java.util.*;

public class bst
{
	//create node
	static class node
	{
		int data;
		node left;
		node right;

		node(int data)
		{
			this.data=data;
		}
	}

	//insert value
	static node insert(node root,int value)
	{
		if (root==null)//if not is null then first node is inseted as root node
		{
			root=new node(value);
			return root;
		}
		else if(root.left>value)//insert into left side
		{
			root.left=insert(root.left,value);
		}
		else//if node is not inserted in left then node in insert in right side
		{
			root.right=insert(root.right,value);
		}
		return root;
	}

	//inorder
	public static void inorder(node root)
	{
		if (root==null) 
		{
			return;
		}
		inorder(root.left);
		System.out.println(root);
		inorder(root.right);
	}

	//preorder
	public static void preorder(node root)
	{
		if (root==null) 
		{
			return;
		}
		System.out.println(root);
		inorder(root.left);
		inorder(root.right);
	}

	//postorder
	public static void postorder(node root)
	{
		if (root==null) 
		{
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.println(root);
	}

	//search element
	public static boolean search(node root,int key)
	{
		if (root==null) 
		{
			return false;
		}
		if (root.data>key) 
		{
			return search(root.left,key);
		}
		if (root.data==key) 
		{
			return true;
		}
		else
		{
			return search(root.right,key);
		}
	}

	//delete
	public static node delete(node root, int val)
	{
		if (root.data>val) 
		{
			root.left=delete(root.left,val);
		}
		else if (root.data<val) 
		{
			root.right=delete(root.right,val);
		}
		else if (root.data==val) 
		{
			//case 1:delete
			if (root.right==null && root.left==null) 
			{
				return null;
			}

			//case 2
			if (root.left==null) 
			{
				return root.right;
			}
			else if (root.right==null) 
			{
				return root.left;
			}
		}
	}
}