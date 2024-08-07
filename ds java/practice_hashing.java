//hashing
import java.util.*;

class new_hashing extends prime
{
	int capacity;
	int[] arr;
	new_hashing(int c)
	{
		capacity=nextPrime(c);
		arr = new int[capacity];
	}

	void insert(int c)
	{
		arr[c%capacity] = c;
	}
	void print()
	{
		for(int val : arr)
		{
			System.out.println(val);
		}
	}
}

class prime
{
	static boolean isPrime(int n) 
    { 
        for (int i=2;i<=n/2 ;i++ ) 
        {
        	if (n%i==0) 
        	{
        		return false;
        	}

        }
        return true;
    } 
    
    static int nextPrime(int N) 
    { 
        if (N % 2== 0) 
        {
            N++; 
        }
     
        while (!isPrime(N)) 
        { 
            N+=2; 
     
            
        } 
     	System.out.println("size ="+N);
        return N; 
    }
}

class hashing
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		prime p = new prime();

		System.out.println("enter size of array : ");
		int n = s.nextInt();
		int n2=p.nextPrime(n);
		new_hashing nh = new new_hashing(n2);

		nh.insert(10);
		nh.insert(20);
		nh.insert(30);
		nh.insert(40);
		nh.print();
	}
}