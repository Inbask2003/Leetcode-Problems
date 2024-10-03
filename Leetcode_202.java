/*
  202. Happy Number --> (03/10/2024) --> (Easy)

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does
not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Example 2:

Input: n = 2
Output: false

Constraints:

1 <= n <= 231 - 1
 */

import java.util.*;
public class Leetcode_202
{
    public static void main(String[] args)
    {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n)
    {
        Set<Integer> set = new HashSet<>();

        while(n != 1 && !(set.contains(n)))
        {
            set.add(n);
            n = help(n);
        }

        return n == 1;
    }

    public static int help(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum = sum + (n % 10) * (n % 10);
            n/=10;
        }
        return sum;
    }
}
