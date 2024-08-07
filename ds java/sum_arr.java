import java.util.*;

public class sum_arr
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements you want to store : ");
		int a=s.nextInt();

		int[] n=new int[a];
		System.out.println("enter your elements : ");
		for (int i=0;i<a;i++) 
		{
			n[i]=s.nextInt();		
		}	

		System.out.println("enter index of array : ");
		int b=s.nextInt();

		for (int i=b;i<a;i++) 
		{
			sum=sum+n[i];
		}
		System.out.println("sum = "+sum);
	}
}