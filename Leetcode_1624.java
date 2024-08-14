/*
  1624. Largest Substring Between Two Equal Characters --> (14/08/2024) --> (Easy)

Given a string s, return the length of the longest substring between two equal characters, excluding the two
characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.

Example 1:

Input: s = "aa"
Output: 0
Explanation: The optimal substring here is an empty substring between the two 'a's.

Example 2:

Input: s = "abca"
Output: 2
Explanation: The optimal substring here is "bc".

Example 3:

Input: s = "cbzxy"
Output: -1
Explanation: There are no characters that appear twice in s.

Constraints:

1 <= s.length <= 300
s contains only lowercase English letters.
 */

public class Leetcode_1624
{
    public static void main(String[] args)
    {
        String s = "bacbdaa";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s)
    {
        int l = s.length();
        int max = -1;

        for(int i = 0;i < l-1;i++)
        {
            for(int j = i+1;j < l;j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    max = Math.max(max,j-i-1);
                }
            }
        }

        return max;
    }
}
