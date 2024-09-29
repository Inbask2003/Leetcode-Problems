/*
  3304. Find the K-th Character in String Game I --> (Contest) --> (29/09/2024) --> (Easy)

Alice and Bob are playing a game. Initially, Alice has a string word = "a".

You are given a positive integer k.

Now Bob will ask Alice to perform the following operation forever:

Generate a new string by changing each character in word to its next character in the English alphabet, and
append it to the original word.
For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".

Return the value of the kth character in word, after enough  operations have been done for word to have
at least k characters.
Note that the character 'z' can be changed to 'a' in the operation.

Example 1:

Input: k = 5
Output: "b"
Explanation:
Initially, word = "a". We need to do the operation three times:
Generated string is "b", word becomes "ab".
Generated string is "bc", word becomes "abbc".
Generated string is "bccd", word becomes "abbcbccd".

Example 2:

Input: k = 10
Output: "c"

Constraints:

1 <= k <= 500
 */

public class Leetcode_3304
{
    public static void main(String[] args)
    {
        int k = 15;
        System.out.println(kthCharacter(k));
    }

    public static char kthCharacter(int k)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        while(sb.length() < k)
        {
            StringBuilder sr = new StringBuilder();
            for(char c : sb.toString().toCharArray())
            {
                if(c == 'z')
                {
                    sr.append("a");
                }
                else
                {
                    sr.append(++c+"");
                }
            }
            sb.append(sr);
        }
        return sb.charAt(k-1);
    }
}
