//to find position of the smallest number from given n numbers

import java.util.*;

class pra_12
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int max=0;

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
			if (max<array[i]) 
			{
				max=array[i];
			}
		}
		System.out.println("maximum number is = "+max);
	}
}