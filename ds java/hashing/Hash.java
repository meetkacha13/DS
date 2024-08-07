import java.util.*;

class Hash 
{
    public static void main (String args []) 
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter the size of the array: ");
        int n = in.nextInt ();
        int arr [] = new int [n];
        System.out.println ("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            arr [i] = in.nextInt ();
        }

        ArrayList<Integer> primeArr = new ArrayList<Integer> ();
        for (int i = 0; i < n; i++) 
        {
            boolean isPrime = true;
            for (int j = 2; j < arr [i]; j++) 
            {
                if (arr [i] % j == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && arr [i] > 1) 
            {
                primeArr.add (arr [i]);
            }
        }
        Hashtable<Integer, Integer> Hashtable = new Hashtable<Integer, Integer> ();
        for (int i = 0; i < primeArr.size (); i++) 
        {
            int key = primeArr.get (i);
            int value = key * 2;
            Hashtable.put (key, value);
        }
        System.out.println ("The hash table is: " + Hashtable);
        
    }
}
