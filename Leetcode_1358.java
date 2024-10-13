/*
  1358. Number of Substrings Containing All Three Characters --> (13/10/2024) --> (Medium)

Given a string s consisting only of characters a, b and c.
Return the number of substrings containing at least one occurrence of all these characters a, b and c.

Example 1:

Input: s = "abcabc"
Output: 10
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc",
 "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again).

Example 2:

Input: s = "aaacb"
Output: 3
Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb",
 "aacb" and "acb".

Example 3:

Input: s = "abc"
Output: 1

Constraints:

3 <= s.length <= 5 x 10^4
s only consists of a, b or c characters.
 */

public class Leetcode_1358
{
    public static void main(String[] args)
    {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s)
    {
        int[] freq = new int[3];
        int size = 3;
        int l = s.length();
        int start = 0;
        int out = 0;
        for(int i = 0;i < l;i++)
        {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            if(freq[ch - 'a'] == 1)
            {
                size--;
            }
            while(size == 0 && start < l)
            {
                out+=l-i;
                freq[s.charAt(start) - 'a']--;
                if(freq[s.charAt(start) - 'a'] == 0)
                {
                    size++;
                }
                start++;
            }
        }
        return out;
    }
}
