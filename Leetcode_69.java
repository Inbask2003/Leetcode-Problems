/*
  69. Sqrt(x) --> (Easy) --> (8/7/2024) , Monday

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

Constraints:

0 <= x <= 231 - 1
 */

public class Leetcode_69
{
    public static void main(String[] args)
    {
        int x = (625);
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if(x == 0 || x == 1)
        {
            return x;
        }

        int i = 1;
        int j = x;
        int mid = 0;

        while(i <= j)
        {
            mid = i + (j - i) / 2;
            if(mid * mid == x)
            {
                return mid;
            }
            // square of integer value maybe long
            else if((long)mid * mid > (long)x)
            {
                j = mid - 1;
            }
            else
            {
                i = mid + 1;
            }
        }
        return j;
    }

}
