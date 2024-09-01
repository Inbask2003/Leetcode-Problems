/*
  3274. Check if Two Chessboard Squares Have the Same Color --> (01/09/2024) --> (Easy) --> (Contest)

You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an
8 x 8 chessboard.
Return true if these two squares have the same color and false otherwise.
The coordinate will always represent a valid chessboard square. The coordinate will always have the letter
first (indicating its column), and the number second (indicating its row).

Example 1:

Input: coordinate1 = "a1", coordinate2 = "c3"
Output: true
Explanation:
Both squares are black.

Example 2:

Input: coordinate1 = "a1", coordinate2 = "h3"
Output: false
Explanation:

Square "a1" is black and "h3" is white.

Constraints:

coordinate1.length == coordinate2.length == 2
'a' <= coordinate1[0], coordinate2[0] <= 'h'
'1' <= coordinate1[1], coordinate2[1] <= '8'
 */

public class Leetcode_3274
{
    public static void main(String[] args)
    {
        String coordinate1 = "a1";
        String coordinate2 = "c3";
        System.out.println(checkTwoChessboards(coordinate1,coordinate2));
    }

    public static boolean checkTwoChessboards(String coordinate1, String coordinate2)
    {
        int str1 = coordinate1.charAt(0)-'a';
        int str2 = coordinate2.charAt(0)-'a';
        int num1 = coordinate1.charAt(1)-'0';
        int num2 = coordinate2.charAt(1)-'0';

        if(str1 % 2 ==  str2 % 2)
        {
            if(num1 % 2 == num2 % 2)
            {
                return true;
            }
        }
        else if(str1 % 2 != str2 % 2)
        {
            if(num1 % 2 != num2 % 2)
            {
                return true;
            }
        }
        return false;
    }
}
