/*
  383. Ransom Note --> (18/07/2024) --> (Easy)

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

Constraints:

1 <= ransomNote.length, magazine.length <= 105
ransomNote and magazine consist of lowercase English letters
 */

public class Leetcode_383
{
    public static void main(String[] args)
    {
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine)
    {
        if(ransomNote.length() > magazine.length())
        {
            return false;
        }
        int arr[] = new int[26];
        // magazine -> a-2,b-1 then ransomNote -> a-2
        for(char i : magazine.toCharArray())
        {
            arr[i-'a']++;
        }
        // ransomeNote -> a-2
        for(char i : ransomNote.toCharArray())
        {
            // a = 2,a != 0 --> a = 1,a != 0
            if(arr[i-'a'] == 0)
            {
                return false;
            }
            // a2-- = > a1 --> a1-- => a0
            arr[i-'a']--;
        }
        // true is returned
        return true;
    }
}
