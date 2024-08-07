//to delete a number from a given location in an array
import java.util.*;

class pra_16
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int temp;

		System.out.println("enter size of array : ");
		int size=s.nextInt();

		int[] array = new int[size];
		int[] array2 = new int[size-1];

		System.out.println("enter elements : ");

		for (int i=0;i<size ;i++ ) 
		{
		 	array[i]=s.nextInt();
		}

		System.out.println("enter location of array for delete element : ");
		int location = s.nextInt();

		for (int i=0;i<size ;i++ ) 
		{
			if (location==i) 
			{
				temp = array[i];
			}
		}

		//after delete number arrange elements
		for (int i=0;i<location ;i++ ) 
		{
			array2[i]=array[i];
		}

		for (int i=location;i<size ;i++ ) 
		{
			array2[i-1]=array[i];
		}

		System.out.println("after delete");

		for (int i=0;i<size-1 ;i++ ) 
		{
			System.out.println(array2[i]);
		}
	}
}