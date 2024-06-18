/* 
2595. Number of Even and Odd Bits

You are given a positive integer n.

Let even denote the number of even indices in the binary representation of n with value 1.

Let odd denote the number of odd indices in the binary representation of n with value 1.

Note that bits are indexed from right to left in the binary representation of a number.

Return the array [even, odd].

 

Example 1:

Input: n = 50

Output: [1,2]

Explanation:

The binary representation of 50 is 110010.

It contains 1 on indices 1, 4, and 5.

Example 2:

Input: n = 2

Output: [0,1]

Explanation:

The binary representation of 2 is 10.

It contains 1 only on index 1.
*/

public class NumberofEvenandOddBits_2595 
{
    public static void main(String args[])
    {
       int a[] = evenOddBit(2);
       for(int i : a)
       {
        System.out.print(i+" ");
       }
    }

    public static int[] evenOddBit(int n) 
    {
        int out[] = new int[2];
        int count = 0;
        while(n > 0)
        {
            int temp = n % 2;
            if(count % 2 == 0 && temp == 1)
            {
                out[0]++;
            }
            if(count % 2 == 1 && temp == 1)
            {
                out[1]++;
            }
            n/=2;
            count++;
        }
        return out;
    }
    
}
