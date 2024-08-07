import java.util.*;
import java.lang.*;

public class linear_search 
{
    static int search(int a[], int n, int key)
    {
        for(int i=0; i<n; i++)
        {
            if (a[i] == key) 
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int a[] = new int[100];
        int n, key, i;

        System.out.println("enter the size of array : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println("enter the element of array : ");
        for(i = 0; i<n; i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("elements are :");
        for(i =0; i<n; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("enter the element to be searched : ");
        key = s.nextInt();

        int index = search(a, n, key);
        System.out.println("index of element is : "+index);
    }
}
