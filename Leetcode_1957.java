/*
  1957. Delete Characters to Make Fancy String --> (01//1/2024) --> (Easy)

A fancy string is a string where no three consecutive characters are equal.

Given a string s, delete the minimum possible number of characters from s to make it fancy.

Return the final string after the deletion. It can be shown that the answer will always be unique.

Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".

Example 2:

Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".

Example 3:

Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".

Constraints:

1 <= s.length <= 105
s consists only of lowercase English letters.
 */

public class Leetcode_1957
{
    public static void main(String[] args)
    {
        String s = "aaabaaaa";
        System.out.println(makeFancyString(s));
    }

    public static String makeFancyString(String s)
    {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length() - 2;
        while(i < n)
        {
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            char third = s.charAt(i+2);
            if(first == second && second == third)
            {
                i++;
            }
            else
            {
                sb.append(first);
                i++;
            }
        }
        while(i < s.length())
        {
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
