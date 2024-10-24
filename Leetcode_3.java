/*
  3. Longest Substring Without Repeating Characters --> (02/09/2024) --> (Medium)

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */

import java.util.*;
public class Leetcode_3
{
    public static void main(String[] args)
    {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s)
    {
        int max = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
