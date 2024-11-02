/*
  3084. Count Substrings Starting and Ending with Given Character --> (02/11/2024) --> (Medium)

You are given a string s and a character c. Return the total number of substrings of s that start and end with
 c.

Example 1:

Input: s = "abada", c = "a"
Output: 6
Explanation: Substrings starting and ending with "a" are: "abada", "abada", "abada", "abada", "abada", "abada".

Example 2:

Input: s = "zzz", c = "z"
Output: 6
Explanation: There are a total of 6 substrings in s and all start and end with "z".

Constraints:

1 <= s.length <= 105
s and c consist only of lowercase English letters.
 */

public class Leetcode_3084
{
    public static void main(String[] args)
    {
        String s = "abada";
        char c = 'a';
        System.out.println(countSubstrings(s,c));
    }

    public static long countSubstrings(String s, char c)
    {
        long count = 0;
        for(char i : s.toCharArray())
        {
            if(i == c)
            {
                count++;
            }
        }
        return (count * (count + 1)) / 2;
    }
}
