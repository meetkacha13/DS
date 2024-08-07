import java.util.*;

public class matrix_multi
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);

		int i, j;

		int[][] a=new int[3][2];
		int[][] b=new int[2][3];

		for (i=0;i<3;i++)
		{
			for (j=0;j<2;j++) 
			{
				a[i][j]=s.nextInt();		
			}	
		}

		for (i=0;i<2;i++) 
		{
			for (j=0;j<3;j++) 
			{
				b[i][j]=s.nextInt();		
			}	
		}

		int[][] n= new int[2][2];

		mul_matrix m= new mul_matrix();

		n= m.multi(a, b);

		for (i=0;i<2;i++)
		{
			for (j=0;j<2;j++) 
			{
				System.out.println("n["+i+"]["+j+"]"+n[i][j]);		
			}	
		}
	}
}

class mul_matrix
{
	public int[][] multi(int[][] a, int[][] b)
	{
		int i, j, k, sum;

		int[][] n= new int[3][3];

		for (i=0;i<3;i++) 
		{
			for (j=0;j<3;j++) 
			{
				sum=0;
				for (k=0;k<2;k++) 
				{
					sum = sum + a[i][k] * b[k][j];			
				}		
				n[i][j]=sum;
			}	
		}
		return n;
	}	
}
