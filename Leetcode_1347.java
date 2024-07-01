/*
  1347. Minimum Number of Steps to Make Two Strings Anagram

  You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.

Return the minimum number of steps to make t an anagram of s.

An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

Example 1:

Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.

Example 2:

Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.

Example 3:

Input: s = "anagram", t = "mangaar"
Output: 0
Explanation: "anagram" and "mangaar" are anagrams
 */

import java.util.*;
public class Leetcode_1347
{
    public static void main(String[] args)
    {
        String s = "leetcode";
        String t = "practice";
        System.out.println(minSteps(s,t));
    }

    public static int minSteps(String s, String t)
    {
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i : s.toCharArray())
        {
            // if map already contains this element increment value + 1
            if(map.containsKey(i))
            {

                map.put(i,map.get(i)+1);
            }
            // if map doesn't have this element initialize value 1
            else
            {
                map.put(i,1);
            }
        }
        for(char i : t.toCharArray())
        {
            // if map contains the string element and there value is greater than 0, then decrement the value - 1
            if(map.containsKey(i) && map.get(i) > 0)
            {
                map.put(i,map.get(i)-1);
            }
            // if map contains value but it is already equals to string element so this element value is 0, so we increment the count +1
            else
            {
                count++;
            }
        }
        return count;
    }

}
