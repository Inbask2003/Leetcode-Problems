/*
  1380. Lucky Numbers in a Matrix --> (19/07/2024) --> (Easy)

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.

Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.
 */

import java.util.*;
public class Leetcode_1380
{
    public static void main(String[] args)
    {
        int matrix[][] = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix)
    {
        List<Integer> out = new ArrayList<>();
        for(int i = 0;i < matrix.length;i++)
        {
            int min = Integer.MAX_VALUE;
            int col = 0;
            for(int j = 0;j < matrix[i].length;j++)
            {
                if(min > matrix[i][j])
                {
                    // min is the minimum value of particular row
                    min = matrix[i][j];
                    col = j;
                }
            }
            boolean flag = true;
            for(int k = 0;k < matrix.length;k++)
            {
                // check minimum element of row is minimum element of that column then it is false
                if(matrix[i][col] < matrix[k][col])
                {
                    flag = false;
                    break;
                }
            }
            // minimum element of row is maximum element of column then it is added in list
            if(flag)
            {
                out.add(matrix[i][col]);
            }
        }
        return out;
    }
}
