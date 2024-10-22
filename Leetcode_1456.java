/*
  1456. Maximum Number of Vowels in a Substring of Given Length --> (22/10/2024) --> (Medium)

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with
length k.
Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length
 */

public class Leetcode_1456
{
    public static void main(String[] args)
    {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k)
    {
        String vowels = "aeiou";
        int count = check(s.substring(0,k),vowels);
        int max = count;
        for(int i = k;i < s.length();i++)
        {
            char curr = s.charAt(i);
            char toRemove = s.charAt(i-k);
            if(vowels.contains(curr+""))
            {
                count++;
            }
            if(vowels.contains(toRemove+""))
            {
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }

    public static int check(String str,String vowels)
    {
        int count = 0;
        for(char c : str.toCharArray())
        {
            if(vowels.contains(c+""))
            {
                count++;
            }
        }
        return count;
    }
}
