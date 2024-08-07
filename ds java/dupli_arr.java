import java.util.*;

public class dupli_arr
{
	public static void main(String[] args) 
	{
		int i, j, temp=0;
		int a[]={1,2,3,4,5,6,7,8,9};
		//for find value
		for (i=0;i<a.length;i++) 
		{
			for (j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					temp++;
					System.out.println("array have duplicate numbers a["+j+"]");
				}			
			}		
		}	
		if(temp==0)
		{
			System.out.println("array have not duplicate numbers");
		}
	}
}