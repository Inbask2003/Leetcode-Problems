/*
  1941. Check if All Characters Have Equal Number of Occurrences --> (Easy)

Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

Constraints:

1 <= s.length <= 1000
s consists of lowercase English letters.
 */

import java.util.*;
public class Leetcode_1941
{
    public static void main(String[] args)
    {
        String s = "abacbc";
        System.out.println(areOccurrencesEqual(s));
    }

    public static boolean areOccurrencesEqual(String s)
    {
        Map<Character,Integer> map = new HashMap<>();

        // insert the string characters and it's occurences in map
        for(char i : s.toCharArray())
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        // store the map values(characters occurences) in set
        Set<Integer> set = new HashSet<>(map.values());

        // if the set size is equal to 1 which means all characters have equal number of occurences, else retur false
        return set.size() == 1;
    }

}
