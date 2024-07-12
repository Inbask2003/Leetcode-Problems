/*
  345. Reverse Vowels of a String --> (12/7/2024) --> (Easy)

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"

Example 2:

Input: s = "leetcode"
Output: "leotcede"

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */

import java.util.*;
public class Leetcode_345
{
    public static void main(String[] args)
    {
        String s ="leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s)
    {
        char arr[] = s.toCharArray();
        char vowel[] = {'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> set = new HashSet<>();

        for(char v : vowel)
        {
            set.add(v);
        }
        int i = 0,j = arr.length-1;
        while(i < j)
        {
            if(set.contains(arr[i]) && set.contains(arr[j]))
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(set.contains(arr[i]))
            {
                j--;
            }
            else if(set.contains(arr[j]))
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
        }
        return new String(arr);
    }

}
