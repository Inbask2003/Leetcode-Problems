/* 
  1832. Check if the Sentence is Pangram
 
  A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.


Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:

Input: sentence = "leetcode"
Output: false
*/

import java.util.Set;
import java.util.TreeSet;

public class Leetcode_1832
{
    public static void main(String[] args) 
    {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> s = new TreeSet<Character>();
        for(char i : sentence.toCharArray())
        {
            s.add(i);
        }
        if(s.size() == 26)
        {
            return true;
        }
        return false;
    }
}