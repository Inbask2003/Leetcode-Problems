/*
  1323. Maximum 69 Number --> (31/08/2024) --> (Easy)

You are given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

Example 1:

Input: num = 9669
Output: 9969
Explanation:
Changing the first digit results in 6669.
Changing the second digit results in 9969.
Changing the third digit results in 9699.
Changing the fourth digit results in 9666.
The maximum number is 9969.

Example 2:

Input: num = 9996
Output: 9999
Explanation: Changing the last digit 6 to 9 results in the maximum number.

Example 3:

Input: num = 9999
Output: 9999
Explanation: It is better not to apply any change.

Constraints:

1 <= num <= 104
num consists of only 6 and 9 digits.
 */

public class Leetcode_1323
{
    public static void main(String[] args)
    {
        int num = 996969;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number (int num)
    {
        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '6')
            {
                sb.append('9');
                i++;
                break;
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        while(i < s.length())
        {
            sb.append(s.charAt(i));
            i++;
        }
        return Integer.parseInt(sb.toString());
    }
}
