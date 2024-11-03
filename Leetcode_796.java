/*
  796. Rotate String --> (03/11/2024) --> (Easy)

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:

Input: s = "abcde", goal = "abced"
Output: false

Constraints:

1 <= s.length, goal.length <= 100
s and goal consist of lowercase English letters.
 */

public class Leetcode_796
{
    public static void main(String[] args)
    {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));
    }

    public static boolean rotateString(String s, String goal)
    {
        if(s.length() != goal.length())
        {
            return false;
        }
        return (s+s).contains(goal);
    }
}
