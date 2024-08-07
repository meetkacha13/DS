import java.util.*;

public class delete_value_arr
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		//enter array size
		System.out.println("enter array size : ");
		int s = sc.nextInt();

		//enter your array
		System.out.println("enter your element : ");
		int a[] = new int[s];

		for (int i=0;i<s;i++) 
		{
			a[i] = sc.nextInt();
		}

		//enter index you want to delete element
		System.out.println("enter your index for delete element : ");
		int d = sc.nextInt();		

		//call class for delete element
		DeleteAtIndex di = new DeleteAtIndex();
		int arr[] = new int[s-1];
		arr = di.delete(a, d);

		//display delete array 
		System.out.println("after deleted element array : ");
		for (int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]+"");
		}
	}
}

class DeleteAtIndex
{
	public int[] delete(int a[], int d)
	{
		int arr[] = new int[a.length-1];
		int i=0;

		for (i=0;i<a.length;i++) 
		{
			if (i==d) 
			{
				arr[i] = a[i+1];
				break;
			}
			else
			{
				arr[i] = a[i];
			}
		}

		for (int j=i+1;j<arr.length;j++) 
		{
			arr[j] = a[i+2];
			i++;
		}
		return arr;
	}
}