/*
  5. Longest Palindromic Substring --> (21/08/2024) --> (Medium)

Given a string s, return the longest palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:

Input: s = "cbbd"
Output: "bb"

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */

public class Leetcode_5
{
    public static void main(String[] args)
    {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s)
    {
        String max = "";
        for(int i = 0;i < s.length();i++)
        {
            for(int j = i+1;j <= s.length();j++)
            {
                String str = s.substring(i,j);
                if(check(str) && max.length() < str.length())
                {
                    max = str;
                }
            }
        }
        return max;
    }

    public static boolean check(String str)
    {
        int i = 0;
        int j = str.length()-1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
