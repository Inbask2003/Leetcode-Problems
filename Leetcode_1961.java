/*
  1961. Check If String Is a Prefix of Array --> (20/08/2024) --> (Easy)

Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for
some positive k no larger than words.length.

Return true if s is a prefix string of words, or false otherwise.

Example 1:

Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.

Example 2:

Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr.

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 20
1 <= s.length <= 1000
words[i] and s consist of only lowercase English letters.
 */

public class Leetcode_1961
{
    public static void main(String[] args)
    {
        String s = "iloveleetcode";
        String words[] = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s,words));
    }

    public static boolean isPrefixString(String s, String[] words)
    {
        StringBuilder sb = new StringBuilder();

        for(String i : words)
        {
            sb.append(i);
            if(s.equals(sb.toString()))
            {
                return true;
            }
            if(s.length() < sb.length())
            {
                return false;
            }
        }

        return false;
    }
}
