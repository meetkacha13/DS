//to calculate average of first n numbers

import java.util.*;

class pra_11
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int sum=0;
		float avg;

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
			sum = sum + array[i];
		}
		avg = sum / size;

		System.out.println("average = "+avg);
	}
}