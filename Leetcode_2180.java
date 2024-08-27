/*
  2180. Count Integers With Even Digit Sum --> (27/08/2024) --> (Easy)

Given a positive integer num, return the number of positive integers less than or equal to num whose digit
sums are even.

The digit sum of a positive integer is the sum of all its digits.

Example 1:

Input: num = 4
Output: 2
Explanation:
The only integers less than or equal to 4 whose digit sums are even are 2 and 4.

Example 2:

Input: num = 30
Output: 14
Explanation:
The 14 integers less than or equal to 30 whose digit sums are even are
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.

Constraints:

1 <= num <= 1000
 */

public class Leetcode_2180
{
    public static void main(String[] args)
    {
        int num = 30;
        System.out.println(countEven(num));
    }

    public static int countEven(int num)
    {
        int count = 0;
        for(int i = 2;i <= num;i++)
        {
            int n = i;
            int sum = 0;
            while(n > 0)
            {
                sum+=n%10;
                n/=10;
            }
            if(sum % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}
