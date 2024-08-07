import java.util.*;

public class arr
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of element you want to store : ");
		int a=s.nextInt();

		int[] n=new int[a];

		System.out.println("enter element : ");

		for (int i=0;i<a;i++) 
		{
			n[i]=s.nextInt();	
		}

		System.out.println("your elements are : ");

		for (int i=0;i<a;i++) 
		{
			System.out.println(n[i]);	
		}
	}
}