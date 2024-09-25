/*
  1309. Decrypt String from Alphabet to Integer Mapping --> (25/09/2024) --> (Easy)

You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.
The test cases are generated so that a unique mapping will always exist.

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".

Example 2:

Input: s = "1326#"
Output: "acz"

Constraints:

1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.
 */

public class Leetcode_1309
{
    public static void main(String[] args)
    {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1;i >=0 ;i--)
        {
            int k = 0;
            if(s.charAt(i) == '#')
            {
                k = Integer.parseInt(s.substring(i - 2,i));
                i-=2;
            }
            else
            {
                k = s.charAt(i) - '0';
            }
            sb.append((char)(k+96));
        }
        return sb.reverse().toString();
    }
}
