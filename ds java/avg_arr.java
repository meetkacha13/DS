import java.util.*;

public class avg_arr
{
	public static void main(String[] args) 
	{
		int avg=0, sum=0;
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

		//find average
		for (int i=0;i<a;i++) 
		{
			sum=sum+n[i];	
			avg=sum/a;
		}
		System.out.println("your average is : "+avg);
	}
}