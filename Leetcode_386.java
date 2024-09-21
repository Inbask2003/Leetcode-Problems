/*
  386. Lexicographical Numbers --> (21/09/2024) --> (Medium)

Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.

You must write an algorithm that runs in O(n) time and uses O(1) extra space.

Example 1:

Input: n = 13
Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]

Example 2:

Input: n = 2
Output: [1,2]

Constraints:

1 <= n <= 5 * 104
 */

import java.util.*;
public class Leetcode_386
{
    public static void main(String[] args)
    {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }

    public static List<Integer> lexicalOrder(int n)
    {
        List<String> list = new ArrayList<>();

        for(int i = 1;i <= n;i++)
        {
            list.add(i+"");
        }

        Collections.sort(list);
        List<Integer> out = new ArrayList<>();

        for(String i : list)
        {
            out.add(Integer.valueOf(i));
        }

        return out;
    }
}
