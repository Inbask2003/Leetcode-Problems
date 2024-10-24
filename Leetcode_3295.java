/*
  3295. Report Spam Message --> (22/09/2024) --> (Medium)

You are given an array of strings message and an array of strings bannedWords.
An array of words is considered spam if there are at least two words in it that exactly match any word in
bannedWords.
Return true if the array message is spam, and false otherwise.

Example 1:

Input: message = ["hello","world","leetcode"], bannedWords = ["world","hello"]
Output: true
Explanation:
The words "hello" and "world" from the message array both appear in the bannedWords array.

Example 2:

Input: message = ["hello","programming","fun"], bannedWords = ["world","programming","leetcode"]
Output: false
Explanation:
Only one word from the message array ("programming") appears in the bannedWords array.

Constraints:

1 <= message.length, bannedWords.length <= 105
1 <= message[i].length, bannedWords[i].length <= 15
message[i] and bannedWords[i] consist only of lowercase English letters.
 */

import java.util.*;
public class Leetcode_3295
{
    public static void main(String[] args)
    {
        String[] message = {"hello","world","leetcode"};
        String[] bannedWord = {"world","hello"};
        System.out.println(reportSpam(message,bannedWord));
    }

    public static boolean reportSpam(String[] message, String[] bannedWords)
    {
        int count = 0;
        Set<String> set = new HashSet<>();

        for(String i : bannedWords)
        {
            set.add(i);
        }

        for(int i = 0;i < message.length;i++)
        {
            if(set.contains(message[i]))
            {
                count++;
            }
        }
        return count >= 2;
    }
}
