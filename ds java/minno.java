import java.util.*;

public class minno
{
	public static void main(String[] args) 
	{
		int min=Integer.MAX;
		Scanner s=new Scanner(System.in);
		//user define how many elements wants to store
		System.out.println("enter no of elements you want to store : ");
		int a=s.nextInt();

		//user enters array value
		int[] n=new int[a];
		System.out.println("enter your elements : ");
		for (int i=0;i<a;i++) 
		{
			n[i]=s.nextInt();		
		}		

		//find min value	
		for (int i=0;i<a;i++) 
		{
			if (n[i]<min) 
			{
				min=n[i];		
			}	
		}
		System.out.println("smallest value is : "+min);
	}
}