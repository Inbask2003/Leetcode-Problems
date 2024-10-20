/*
  1812. Determine Color of a Chessboard Square --> (11/10/2024) --> (Easy)

You are given coordinates, a string that represents the coordinates of a square of the chessboard.
Below is a chessboard for your reference.

Return true if the square is white, and false if the square is black.
The coordinate will always represent a valid chessboard square. The coordinate will always have the letter
first, and the number second.

Example 1:

Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.

Example 2:

Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.

Example 3:

Input: coordinates = "c7"
Output: false

Constraints:

coordinates.length == 2
'a' <= coordinates[0] <= 'h'
'1' <= coordinates[1] <= '8'
 */

public class Leetcode_1812
{
    public static void main(String[] args)
    {
        String coordinates = "e5";
        System.out.println(squareIsWhite(coordinates));
    }

    public static boolean squareIsWhite(String coordinates)
    {
        int alpha = coordinates.charAt(0) - 'a';
        int num = coordinates.charAt(1) - '0';
        if(alpha % 2 == 0 && num % 2 == 0 || alpha % 2 == 1 && num % 2 == 1)
        {
            return true;
        }
        return false;
    }
}
