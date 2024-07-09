/*
  3200. Maximum Height of a Triangle --> (Easy) --> (9/7/2024)

You are given two integers red and blue representing the count of red and blue colored balls. You have to arrange these balls to form a triangle such that the 1st row will have 1 ball, the 2nd row will have 2 balls, the 3rd row will have 3 balls, and so on.

All the balls in a particular row should be the same color, and adjacent rows should have different colors.

Return the maximum height of the triangle that can be achieved.

Example 1:

Input: red = 2, blue = 4
Output: 3

Example 2:

Input: red = 2, blue = 1
Output: 2

Example 3:

Input: red = 1, blue = 1
Output: 1

Example 4:

Input: red = 10, blue = 1
Output: 2

Constraints:

1 <= red, blue <= 100
 */

public class Leetcode_3200
{
    public static void main(String[] args)
    {
        int red = 2;
        int blue = 4;
        System.out.println(maxHeightOfTriangle(red,blue));
    }

    public static int maxHeightOfTriangle(int red, int blue)
    {
        int red2 = red;
        int blue2 = blue;
        int out1 = 0,out2 = 0;
        int i = 1;
        while(true)
        {
            if(i % 2 == 0)
            {
                if(red >= i)
                {
                    red-=i;
                }
                else
                {
                    break;
                }
            }
            else
            {
                if(blue >= i)
                {
                    blue-=i;
                }
                else
                {
                    break;
                }
            }
            out1++;
            i++;
        }

        int j = 1;
        while(true)
        {
            if(j % 2 == 1)
            {
                if(red2 >= j)
                {
                    red2-=j;
                }
                else
                {
                    break;
                }
            }
            else
            {
                if(blue2 >= j)
                {
                    blue2-=j;
                }
                else
                {
                    break;
                }
            }
            out2++;
            j++;
        }

        return Math.max(out1,out2);
    }

}
