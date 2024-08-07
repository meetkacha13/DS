//1235
//ele=4,idx=3
//12345



//not complete

import java.util.*;

public class insert_value_arr
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int temp;
		//enter size of index
		System.out.println("enter no of index you want to store : ");
		int a=s.nextInt();

		int[] n=new int[a];
		//enter elements
		System.out.println("enter your elements : ");
		for (int i=0;i<a;i++) 
		{
			n[i]=s.nextInt();		
		}	
		//enter which index we want to insert
		System.out.println("enter index of array : ");
		int b=s.nextInt();	

		//enter new element
		System.out.println("enter new element : ");
		int c=s.nextInt();

		//insert element logic
		for (int i=0;i<=b;i++) 
		{
				temp=n[i];
				n[i]=c;
		}

		System.out.println("your elements : ");
		for (int i=0;i<a;i++) 
		{
			//display array
			System.out.println("n["+i+"] = "+n[i]);		
		}	
	}
}