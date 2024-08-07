// to calculate sum of numbers from m to n

import java.util.*;

class pra_10
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int ans=0;

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
			ans = ans + array[i];
		}

		System.out.println("answer = "+ans);
	}
}