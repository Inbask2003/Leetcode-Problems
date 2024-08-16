/*
  3248. Snake in Matrix --> (16/08/2024) --> (Easy)

There is a snake in an n x n matrix grid and can move in four possible directions. Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.

The snake starts at cell 0 and follows a sequence of commands.

You are given an integer n representing the size of the grid and an array of strings commands where each
command[i] is either "UP", "RIGHT", "DOWN", and "LEFT". It's guaranteed that the snake will remain within
the grid boundaries throughout its movement.

Return the position of the final cell where the snake ends up after executing commands.

Example 1:

Input: n = 2, commands = ["RIGHT","DOWN"]
Output: 3
Explanation:
0	1
2	3

0	1
2	3

0	1
2	3

Example 2:

Input: n = 3, commands = ["DOWN","RIGHT","UP"]
Output: 1
Explanation:

0	1	2
3	4	5
6	7	8

0	1	2
3	4	5
6	7	8

0	1	2
3	4	5
6	7	8

0	1	2
3	4	5
6	7	8

Constraints:

2 <= n <= 10
1 <= commands.length <= 100
commands consists only of "UP", "RIGHT", "DOWN", and "LEFT".
The input is generated such the snake will not move outside of the boundaries.
 */

import java.util.*;
public class Leetcode_3248
{
    public static void main(String[] args)
    {
        List<String> commands = new ArrayList<>(Arrays.asList("RIGHT","DOWN"));
        int n = 2;
        System.out.println(finalPositionOfSnake(n,commands));
    }

    public static int finalPositionOfSnake(int n, List<String> commands)
    {
        int a = 0;
        int b = 0;
        for(String i : commands)
        {
            if(i.equals("RIGHT"))
            {
                b++;
            }
            else if(i.equals("LEFT"))
            {
                b--;
            }
            else if(i.equals("UP"))
            {
                a--;
            }
            else if(i.equals("DOWN"))
            {
                a++;
            }
        }
        return (a * n) + b;
    }
}
