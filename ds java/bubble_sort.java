//bubble sort
class bubble_sort
{
	void bubblesort(int arr[])
	{
		int n = arr.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	int binarysearch(int arr[], int x)
	{
		int left=0, right=arr.length-1;
		while (left<=right) 
		{
			int mid = left+(right - left)/2;

			if (arr[mid]==x) 
			{
				return mid;
			}
			if (arr[mid]<x) 
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		bubble_sort bs = new bubble_sort();
		int arr[] = {64,34,25,12,22,11,90};
		bs.bubblesort(arr);
		int n = arr.length;
		int x = 11;
		int result = bs.binarysearch(arr, x);
		if (result==-1) 
		{
			System.out.println("element not present");
		}
		else
		{
			System.out.println("element found at index : "+result);
		}
	}
}