import java.util.*;

public class swap_udm
{
	public static void main(String[] args) 
	{
		int a, b, c, temp;
		Scanner s= new Scanner(System.in);
		System.out.println("enter no 1 : ");
		a = s.nextInt();

		System.out.println("enter no 2 : ");
		b= s.nextInt();

		//swap
		c=swap(a, b);
	}
		public static int swap(int a,int b)
		{
			int temp=a;
			a=b;
			b=temp;
			System.out.println("after swap : ");
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			return a;
	}
}