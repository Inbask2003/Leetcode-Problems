/*
  962. Maximum Width Ramp --> (10/10/2024) --> (Medium)

A ramp in an integer array nums is a pair (i, j) for which i < j and nums[i] <= nums[j]. The width of such
a ramp is j - i.

Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in nums, return 0.

Example 1:

Input: nums = [6,0,8,2,1,5]
Output: 4
Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.

Example 2:

Input: nums = [9,8,1,0,1,9,4,0,4,1]
Output: 7
Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.

Constraints:

2 <= nums.length <= 5 * 104
0 <= nums[i] <= 5 * 104
 */

import java.util.*;
public class Leetcode_962
{
    public static void main(String[] args)
    {
        int[] nums = {6,0,8,2,1,5};
        System.out.println(maxWidthRamp(nums));
    }

    public static int maxWidthRamp(int[] nums)
    {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++)
        {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i])
            {
                stack.push(i);
            }
        }

        int max = 0;

        for (int i = nums.length - 1; i >= 0; i--)
        {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i])
            {
                max = Math.max(max, i - stack.pop());
            }
        }

        return max;
    }
}
