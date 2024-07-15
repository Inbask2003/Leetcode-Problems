/*
  2486. Append Characters to String to Make Subsequence --> (15/07/2024) --> (Medium)

You are given two strings s and t consisting of only lowercase English letters.

Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.

A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.

Example 1:

Input: s = "coaching", t = "coding"
Output: 4
Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
Now, t is a subsequence of s ("coachingding").
It can be shown that appending any 3 characters to the end of s will never make t a subsequence.

Example 2:

Input: s = "abcde", t = "a"
Output: 0
Explanation: t is already a subsequence of s ("abcde").

Example 3:

Input: s = "z", t = "abcde"
Output: 5
Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
Now, t is a subsequence of s ("zabcde").
It can be shown that appending any 4 characters to the end of s will never make t a subsequence.

Constraints:

1 <= s.length, t.length <= 105
s and t consist only of lowercase English letters
 */

/*
  Procedure :

  take two pointers i & j equal for two string length initially i & j = 0 upto String1 & String2 length coresspondely
  if(s1.charAt(i) == s2.charAt(j)) --> count++ and i++,j++;
  else i++ becaues string1 next character will be equal for string2 current character.
 */

public class Leetcode_2486
{
    public static void main(String[] args)
    {
        String s = "coaching";
        String t = "coding";
        System.out.println(appendCharacters(s,t));
    }

    public static int appendCharacters(String s, String t)
    {
        int count = 0;
        int i = 0;
        int j = 0;
        int l1 = s.length();
        int l2 = t.length();
        while(i < l1 && j < l2)
        {
            if(s.charAt(i) == t.charAt(j))
            {
                count++;
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return l2-count;
    }
}
