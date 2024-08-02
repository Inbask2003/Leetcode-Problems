/*
  171. Excel Sheet Column Number --> (02/08/2024) --> (Easy)

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its
corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...

Example 1:

Input: columnTitle = "A"
Output: 1

Example 2:

Input: columnTitle = "AB"
Output: 28

Example 3:

Input: columnTitle = "ZY"
Output: 701

Constraints:

1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
 */

public class Leetcode_171
{
    public static void main(String[] args)
    {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle)
    {
        int out = 0;
        for(char i : columnTitle.toCharArray())
        {
            out*=26;
            out+=i-'A'+1;
        }
        return out;
    }
}
