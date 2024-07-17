/*
  917. Reverse Only Letters --> (17/072/2024) --> (Easy)

Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1:

Input: s = "ab-cd"
Output: "dc-ba"

Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

Constraints:

1 <= s.length <= 100
s consists of characters with ASCII values in the range [33, 122].
s does not contain '\"' or '\\'.
 */

public class Leetcode_917
{
    public static void main(String[] args)
    {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s)
    {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i <= j)
        {
            if(Character.isLetter(arr[i]) && Character.isLetter(arr[j]) )
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(!(Character.isLetter(arr[i])))
            {
                i++;
            }
            else if(!(Character.isLetter(arr[j])))
            {
                j--;
            }
        }
        return new String(arr);
    }
}
