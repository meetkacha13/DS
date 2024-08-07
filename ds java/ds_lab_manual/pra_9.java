//to read and display n numbers using an array

import java.util.*;

class pra_9
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter size of array : ");
		int size=s.nextInt();

		int[] array = new int[size];

		System.out.println("enter elements : ");

		for (int i=0;i<size ;i++ ) 
		{
		 	array[i]=s.nextInt();
		} 

		for (int i=0;i<size ;i++ ) 
		{
			System.out.println(i+" = "+array[i]);
		}
	}
}