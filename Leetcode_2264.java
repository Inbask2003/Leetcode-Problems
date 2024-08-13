/*
  2264. Largest 3-Same-Digit Number in String --> (13/08/2024) --> (Easy)

You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.

Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".

Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.

Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.

Constraints:

3 <= num.length <= 1000
num only consists of digits
 */

public class Leetcode_2264
{
    public static void main(String[] args)
    {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
    }

    public static String largestGoodInteger(String num)
    {
        int max = Integer.MIN_VALUE;
        int l = num.length();
        char arr[] = num.toCharArray();
        for(int i = 0;i < l-2;i++)
        {
            if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2])
            {
                StringBuilder sb = new StringBuilder();
                sb.append(arr[i]);
                sb.append(arr[i]);
                sb.append(arr[i]);
                String s = new String(sb);
                int n = Integer.parseInt(s);
                max = Math.max(max,n);
                i+=2;
            }
        }
        return (max == Integer.MIN_VALUE) ? "" : (max == 0) ? "000" : max+"";
    }
}
