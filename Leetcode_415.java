/*
  415. Add Strings --> (21/07/2024) --> (Easy)

Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"

Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"

Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"

Constraints:

1 <= num1.length, num2.length <= 104
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
 */

public class Leetcode_415
{
    public static void main(String[] args)
    {
        String num1 = "456";
        String num2 = "77";
        System.out.println(addStrings(num1,num2));
    }

    public static String addStrings(String num1, String num2)
    {
        StringBuilder s = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry > 0)
        {
            int sum = carry;
            if(i >= 0)
            {
                sum+=num1.charAt(i--)-'0';
            }
            if(j >= 0)
            {
                sum+=num2.charAt(j--)-'0';
            }
            s.append(sum%10);
            carry = sum / 10;
        }
        s.reverse();
        return s.toString();
    }
}
