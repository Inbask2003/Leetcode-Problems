/* 
  1684. Count the Number of Consistent Strings

  You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.


Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
*/

import java.util.*;
public class Leetcode_1684 
{
    public static void main(String[] args) 
    {
        String allowed = "ab";
        String words[] = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed,words));
    }   

    public static int countConsistentStrings(String allowed, String[] words) 
    {
        int count = words.length;
        Set<Character> s = new HashSet<>();

        for(char i : allowed.toCharArray())
        {
            s.add(i);
        }

        for(String i : words)
        {
            inner:
            for(char j : i.toCharArray())
            {
                if(!s.contains(j))
                {
                    count--;
                    break inner;
                }
            }
        }
        return count;
    }
}
