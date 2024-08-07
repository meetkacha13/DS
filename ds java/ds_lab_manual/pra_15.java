//to insert a number at a given location in an array
import java.util.*;

class pra_15
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("enter size of array : ");
		int size=s.nextInt();

		int[] array = new int[size];
		int[] array2 = new int[size+1];

		System.out.println("enter elements : ");

		for (int i=0;i<size ;i++ ) 
		{
		 	array[i]=s.nextInt();
		}

		System.out.println("enter location of array for insert element : ");
		int location = s.nextInt();

		System.out.println("enter new element : ");
		int new_element = s.nextInt();

		for (int i=0;i<size ;i++ ) 
		{
			array2[i]=array[i];
		}

		for (int i=0;i<size+1 ;i++ ) 
		{
			if (location==i) 
			{
				array2[i]=new_element;
			}
		}

		System.out.println("after inserted");

		for (int i=0;i<size+1 ;i++ ) 
		{
			System.out.println(array2[i]);
		}
	}
}