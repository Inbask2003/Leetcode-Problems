/*
  942. DI String Match --> (30/07/2024) --> (Easy)

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]

Example 2:

Input: s = "III"
Output: [0,1,2,3]

Example 3:

Input: s = "DDI"
Output: [3,2,0,1]

Constraints:

1 <= s.length <= 105
s[i] is either 'I' or 'D'.
 */

public class Leetcode_942
{
    public static void main(String[] args)
    {
        String s = "";
        System.out.println(diStringMatch(s));
    }

    public static int[] diStringMatch(String s)
    {
        int l = s.length();
        int e = l;
        int out[] = new int[l+1];
        int count = 0;
        int i = 0;
        char arr[] = s.toCharArray();
        for(i = 0;i < e;i++)
        {
            if(arr[i] == 'I')
            {
                out[i] = count++;
            }
            if(arr[i] == 'D')
            {
                out[i] = l--;
            }
        }
        out[i] = count++;
        return out;
    }
}
