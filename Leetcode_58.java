/*
  58. Length of Last Word --> (20/07/2024) --> (Easy)

Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
 */

public class Leetcode_58
{
    public static void main(String[] args)
    {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s)
    {
        int count = 0;

        for(int i = s.length()-1;i >=0 ;i--)
        {
            if(s.charAt(i) == ' ' && count > 0)
            {
                break;
            }
            else if(s.charAt(i) != ' ')
            {
                count++;
            }
        }

        return count;
    }
}
