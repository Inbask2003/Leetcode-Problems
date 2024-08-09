/*
  3174. Clear Digits --> (09/08/2024) --> (Easy)

You are given a string s.

Your task is to remove all digits by doing this operation repeatedly:
Delete the first digit and the closest non-digit character to its left.
Return the resulting string after removing all digits.

Example 1:

Input: s = "abc"
Output: "abc"
Explanation:
There is no digit in the string.

Example 2:

Input: s = "cb34"
Output: ""
Explanation:
First, we apply the operation on s[2], and s becomes "c4".
Then we apply the operation on s[1], and s becomes "".

Constraints:

1 <= s.length <= 100
s consists only of lowercase English letters and digits.
The input is generated such that it is possible to delete all digits.
 */

public class Leetcode_3174
{
    public static void main(String[] args)
    {
        String s = "acb34";
        System.out.println(clearDigits(s));
    }

    public static String clearDigits(String s)
    {
        char arr[] = s.toCharArray();

        for(int i = 0;i < arr.length;i++)
        {
            if(Character.isDigit(arr[i]))
            {
                int j = i-1;
                while(Character.isDigit(arr[j]))
                {
                    j--;
                }
                arr[j] = '1';
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < arr.length;i++)
        {
            if(Character.isLetter(arr[i]))
            {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}
