/*
  884. Uncommon Words from Two Sentences --> (17/09/2024) --> (Easy)

A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Explanation:
The word "sweet" appears only in s1, while the word "sour" appears only in s2.

Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

Constraints:

1 <= s1.length, s2.length <= 200
s1 and s2 consist of lowercase English letters and spaces.
s1 and s2 do not have leading or trailing spaces.
All the words in s1 and s2 are separated by a single space.
 */

import java.util.*;
public class Leetcode_884
{
    public static void main(String[] args)
    {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String out[] = uncommonFromSentences(s1,s2);
        for(String i : out)
        {
            System.out.print(i+" ");
        }
    }

    public static String[] uncommonFromSentences(String s1, String s2)
    {
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        String arr1[] = s1.split(" ");
        String arr2[] = s2.split(" ");
        for(String s : arr1)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : arr2)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> i : map.entrySet())
        {
            if(i.getValue() == 1)
            {
                list.add(i.getKey());
            }
        }
        String out[] = new String[list.size()];
        for(int i = 0;i < list.size();i++)
        {
            out[i] = list.get(i);
        }
        return out;

    }
}
