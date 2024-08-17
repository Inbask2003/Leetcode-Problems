/*
  2129. Capitalize the Title --> (17/08/2024) --> (Easy)

You are given a string title consisting of one or more words separated by a single space, where each word
consists of English letters. Capitalize the string by changing the capitalization of each word such that:

If the length of the word is 1 or 2 letters, change all letters to lowercase.
Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
Return the capitalized title.

Example 1:

Input: title = "capiTalIze tHe titLe"
Output: "Capitalize The Title"
Explanation:
Since all the words have a length of at least 3, the first letter of each word is uppercase, and the
remaining letters are lowercase.

Example 2:

Input: title = "First leTTeR of EACH Word"
Output: "First Letter of Each Word"
Explanation:
The word "of" has length 2, so it is all lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase,
and the remaining letters are lowercase.

Example 3:

Input: title = "i lOve leetcode"
Output: "i Love Leetcode"
Explanation:
The word "i" has length 1, so it is lowercase.
The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase,
and the remaining letters are lowercase.

Constraints:

1 <= title.length <= 100
title consists of words separated by a single space without any leading or trailing spaces.
Each word consists of uppercase and lowercase English letters and is non-empty.
 */

public class Leetcode_2129
{
    public static void main(String[] args)
    {
        String title = "First leTTeR of EACH Word";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title)
    {
        String arr[] = title.split(" ");
        int l = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < l;i++)
        {
            if(i < l-1 && arr[i].length() >= 3)
            {
                sb.append(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase()+" ");
            }
            else if(i == l-1 && arr[i].length() >=3)
            {
                sb.append(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase());
            }
            else if(i < l-1 && arr[i].length() < 3)
            {
                sb.append(arr[i].toLowerCase()+" ");
            }
            else
            {
                sb.append(arr[i].toLowerCase());
            }
        }
        return sb.toString();
    }
}
