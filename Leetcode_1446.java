/*
  1446. Consecutive Characters --> (30/07/2024) --> (Easy)

The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.

Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.
 */

public class Leetcode_1446
{
    public static void main(String[] args)
    {
        String s = "leetcode";
        System.out.println(maxPower(s));
    }

    public static int maxPower(String s)
    {
        int count = 1;
        int max = 1;
        for(int i = 0;i < s.length()-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                count++;
            }
            else
            {
                max = Math.max(max,count);
                count = 1;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}
