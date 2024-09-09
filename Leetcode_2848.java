/*
  2848. Points That Intersect With Cars --> (09/09/2024) --> (Easy)

You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number
line. For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car and end i
is the ending point of the ith car.

Return the number of integer points on the line that are covered with any part of a car.

Example 1:

Input: nums = [[3,6],[1,5],[4,7]]
Output: 7
Explanation: All the points from 1 to 7 intersect at least one car, therefore the answer would be 7.

Example 2:

Input: nums = [[1,3],[5,8]]
Output: 7
Explanation: Points intersecting at least one car are 1, 2, 3, 5, 6, 7, 8. There are a total of 7 points,
therefore the answer would be 7.

Constraints:

1 <= nums.length <= 100
nums[i].length == 2
1 <= starti <= endi <= 100
 */
import java.util.*;
public class Leetcode_2848
{
    public static void main(String[] args)
    {
        int arr[][] = {{3,6},{1,5},{4,7}};
        List<List<Integer>> nums = new ArrayList<>();
        for(int i[] : arr)
        {
            List<Integer> in = new ArrayList<>();
            for(int j : i)
            {
                in.add(j);
            }
            nums.add(in);
        }
        System.out.println(numberOfPoints(nums));
    }

    public static int numberOfPoints(List<List<Integer>> nums)
    {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < nums.size();i++)
        {
            list = nums.get(i);
            int left = list.get(0);
            int right = list.get(1);
            for(int j = left;j <= right;j++)
            {
                set.add(j);
            }
        }

        return set.size();
    }
}
