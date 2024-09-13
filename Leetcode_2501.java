/*
  2501. Longest Square Streak in an Array --> (13/09/2024) --> (Medium)

You are given an integer array nums. A subsequence of nums is called a square streak if:

The length of the subsequence is at least 2, andafter sorting the subsequence, each element (except the
first element) is the square of the previous number.
Return the length of the longest square streak in nums, or return -1 if there is no square streak.

A subsequence is an array that can be derived from another array by deleting some or no elements without
changing the order of the remaining elements.

Example 1:

Input: nums = [4,3,6,16,8,2]
Output: 3
Explanation: Choose the subsequence [4,16,2]. After sorting it, it becomes [2,4,16].
- 4 = 2 * 2.
- 16 = 4 * 4.
Therefore, [4,16,2] is a square streak.
It can be shown that every subsequence of length 4 is not a square streak.

Example 2:

Input: nums = [2,3,5,6,7]
Output: -1
Explanation: There is no square streak in nums so return -1.

Constraints:

2 <= nums.length <= 105
2 <= nums[i] <= 105
 */

import java.util.*;
public class Leetcode_2501
{
    public static void main(String[] args)
    {
        int nums[] = {4,3,6,16,8,2};
        System.out.println(longestSquareStreak(nums));
    }

    public static int longestSquareStreak(int[] nums)
    {
        int out = -1;
        Set<Long> set = new HashSet<>();
        for(int i : nums)
        {
            set.add((long)(i));
        }
        for(int i : nums)
        {
            int streak = 1;
            long num = i;
            while(set.contains(num*num))
            {
                streak++;
                num*=num;
                out = Math.max(out,streak);
            }
        }
        return out;
    }
}
