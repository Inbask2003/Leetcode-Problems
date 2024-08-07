/*
  2278. Percentage of Letter in String --> (07/08/2024) --> (Easy)

Given a string s and a character letter, return the percentage of characters in s that equal letter rounded
down to the nearest whole percent.

Example 1:

Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.

Example 2:

Input: s = "jjjj", letter = "k"
Output: 0
Explanation:
The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.

Constraints:

1 <= s.length <= 100
s consists of lowercase English letters.
letter is a lowercase English letter.
 */

public class Leetcode_2278
{
    public static void main(String[] args)
    {
        String s = "foobar";
        char letter = 'o';
        System.out.println(percentageLetter(s,letter));
    }

    public static int percentageLetter(String s, char letter)
    {
        int count = 0;

        for(char c : s.toCharArray())
        {
            if(c == letter)
            {
                count++;
            }
        }

        return (count * 100 / s.length());
    }
}
