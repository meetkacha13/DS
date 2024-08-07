import java.util.*;

public class Hashing 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n,x;
        System.out.println("Enter the array size :");
        n = sc.nextInt();

        for(int i=n;1>0;i++)
        {
            int flag=0;
           for(int j=2;j<=i/2;j++)
           {
                if(i%j == 0)
                {
                    flag = 1;
                    break;
                }
           }
           if(flag == 0)
           {
                n = i;
                break;
           }
        }

        int array[] = new int[n];
        System.out.println("Enter the values : ");
        for(int i=0;i<n;i++)
        {
            x = sc.nextInt();
            array[x%n] = x;
        }

        System.out.println("The array is : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }    
}
