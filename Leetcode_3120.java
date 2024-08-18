/*
  3120. Count the Number of Special Characters I --> (18/08/2024) --> (Easy)

You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.

Example 1:

Input: word = "aaAbcBC"
Output: 3
Explanation:
The special characters in word are 'a', 'b', and 'c'.

Example 2:

Input: word = "abc"
Output: 0
Explanation:
No character in word appears in uppercase.

Example 3:

Input: word = "abBCab"
Output: 1
Explanation:
The only special character in word is 'b'.

Constraints:

1 <= word.length <= 50
word consists of only lowercase and uppercase English letters.
 */

import java.util.*;
public class Leetcode_3120
{
    public static void main(String[] args)
    {
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars(word));
    }

    public static int numberOfSpecialChars(String word)
    {
        HashSet<Character> set = new HashSet<>();

        for(char i : word.toCharArray())
        {
            set.add(i);
        }

        int count = 0;

        for(char i : word.toCharArray())
        {
            if(Character.isUpperCase(i) && set.contains(Character.toLowerCase(i)))
            {
                count++;
                set.remove(Character.toLowerCase(i));
            }
        }
        return count;
    }
}
