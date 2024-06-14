/*
2544. Alternating Digit Sum
You are given a positive integer n. Each digit of n has a sign according to the following rules:
   The most significant digit is assigned a positive sign.
   Each other digit has an opposite sign to its adjacent digits.
   Return the sum of all digits with their corresponding sign.

Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.

*/
public class AlternatingDigitSum_2544
{
    public static void main(String[] args) 
    {
        System.out.println(alternateDigitSum(2463));
    }

    public static int alternateDigitSum(int n) 
    {
        int a = 0;
        while(n > 0)
        {
            int temp = n % 10;
            a = (a * 10) + temp;
            n/=10;
        }
        int sum = 0;
        int count = 1;
        while(a > 0)
        {
            int temp = a % 10;
            if(count % 2 == 1)
            {
                sum+=temp;
            }
            else
            {
                sum-=temp;
            }
            a/=10;
            count++;
        }
        return sum;
    }
}