/*
  1493. Longest Subarray of 1's After Deleting One Element --> (27/10/2024) --> (Medium)

Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if
there is no such subarray.

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's
is [1,1,1,1,1].

Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
 */

public class Leetcode_1493
{
    public static void main(String[] args)
    {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums)
    {
        int r = 0,l = 0;
        int n = nums.length;
        int max = 0;
        int count = 0;
        while(r < n)
        {
            if(nums[r] == 0)
            {
                count++;
            }
            while(count > 1)
            {
                if(nums[l] == 0)
                {
                    count--;
                }
                l++;
            }
            if(max < r - l +1)
            {
                max = r - l + 1;
            }
            r++;
        }
        return max - 1;
    }
}
