import java.util.*;

public class swap_value_arr
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		int temp;
		//enter how many size we have array
		System.out.println("enter size of array : ");
		int a=s.nextInt();

		//user enters array value
		int[] n=new int[a];
		System.out.println("enter your elements : ");
		for (int i=0;i<a;i++) 
		{
			n[i]=s.nextInt();
			//display array
			System.out.println("n["+i+"] = "+n[i]);		
		}		

		//swap numbers
		for (int i=0;i<n.length;i++)
		{
			for (int j=i+1;j<n.length;j++) 
			{
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;	
			}	
		}

		//display after swap
		for (int i=0;i<a;i++)
		{
			System.out.println("after swap :");
			System.out.println("n["+i+"] = "+n[i]);	
		}
	}
}