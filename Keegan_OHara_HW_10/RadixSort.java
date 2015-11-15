/** Keegan O'Hara
    Radix Sort class
    
    Taken from sanfoundry.com  */


import java.util.Scanner;
import java.util.ArrayList;

 

/** Class RadixSort **/

public class RadixSort 

{

    /** Radix Sort function **/

    public static void radixSort( ArrayList<Integer> a)

    {

        int i, m = a.get(0), exp = 1, n = a.size();

        int[] b = new int[10];

        for (i = 1; i < n; i++)

            if (a.get(i) > m)

                m = a.get(i);

        while (m / exp > 0)

        {

            int[] bucket = new int[10];

 

            for (i = 0; i < n; i++)

                bucket[(a.get(i) / exp) % 10]++;

            for (i = 1; i < 10; i++)

                bucket[i] += bucket[i - 1];

            for (i = n - 1; i >= 0; i--)

                b[--bucket[(a.get(i) / exp) % 10]] = a.get(i);

            for (i = 0; i < n; i++)

                a.set(i, b[i]);

            exp *= 10;        

        }

    } 
}   