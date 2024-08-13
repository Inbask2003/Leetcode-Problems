/*
  1903. Largest Odd Number in String --> (13/08/2024) --> (Easy)

You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string)
that is a non-empty substring of num, or an empty string "" if no odd integer exists.

A substring is a contiguous sequence of characters within a string.

Example 1:

Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.

Example 2:

Input: num = "4206"
Output: ""
Explanation: There are no odd numbers in "4206".

Example 3:

Input: num = "35427"
Output: "35427"
Explanation: "35427" is already an odd number.

Constraints:

1 <= num.length <= 105
num only consists of digits and does not contain any leading zeros.
 */

public class Leetcode_1903
{
    public static void main(String[] args)
    {
        String num = "123520";
        System.out.println(largestOddNumber(num));
    }

    public static String largestOddNumber(String num)
    {
        int l = num.length();

        for(int i = l-1;i >= 0;i--)
        {
            int n = num.charAt(i) - '0';
            if(n % 2 == 1)
            {
                return num.substring(0,i+1);
            }
        }

        return "";
    }
}
