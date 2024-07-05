/*
  242. Valid Anagram --> (Easy)

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters

*/

import java.util.*;
public class Leetcode_242
{
    public static void main(String[] args)
    {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t)
    {
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);
    }

}
