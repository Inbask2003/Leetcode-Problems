/*
  459. Repeated Substring Pattern --> (26/08/2024) --> (Easy)

Given a string s, check if it can be constructed by taking a substring of it and appending multiple
copies of the substring together.

Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:

Input: s = "aba"
Output: false

Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

Constraints:

1 <= s.length <= 104
s consists of lowercase English letters.
 */

public class Leetcode_459
{
    public static void main(String[] args)
    {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s)
    {
        String str = s + s; // s = abab; str = abab + abab ; str = abababab;
        String dummy = str.substring(1,str.length()-1); // dummy = bababa;
        return dummy.contains(s); // bababa.contains(abab);
    }
}
