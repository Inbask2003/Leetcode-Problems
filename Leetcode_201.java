/*
  201. Bitwise AND of Numbers Range --> (18/07/2024) --> (Medium)

Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.

Example 1:

Input: left = 5, right = 7
Output: 4

Example 2:

Input: left = 0, right = 0
Output: 0

Example 3:

Input: left = 1, right = 2147483647
Output: 0

Constraints:

0 <= left <= right <= 231 - 1
 */

public class Leetcode_201
{
    public static void main(String[] args)
    {
        int left = 5;
        int right = 7;
        System.out.println(rangeBitwiseAnd(left,right));
    }

    public static int rangeBitwiseAnd(int left, int right)
    {
        // left = 5 => 101 & right = 7 => 111
        int out = 0;
        while(left != right) // 5 != 7 , 2 != 3 , 1 == 1 so break the loop
        {
            left>>=1;        // 101>>1 => 10 = 2 , 10>>1 => 1 = 1
            right>>=1;       // 111>>1 => 11 = 3 , 11>>1 => 1 = 1
            out++;           // out = 1 , out = 2
        }
        // 1<<2 => 100 = > 4 it is the output
        return left<<out;
    }
}
