/*
  1004. Max Consecutive Ones III --> (26/10/2024) --> (Medium)

Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you
can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
0 <= k <= nums.length
 */

public class Leetcode_1004
{
    public static void main(String[] args)
    {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums,k));
    }

    public static int longestOnes(int[] nums, int k)
    {
        int n = nums.length;
        int r = 0,l = 0;
        int count = 0;
        int max = 0;
        while(r < n)
        {
            if(nums[r] == 0)
            {
                count++;
            }
            while(count > k)
            {
                if(nums[l] == 0)
                {
                    count--;
                }
                l++;
            }
            if(max < r - l + 1)
            {
                max = r - l + 1;
            }
            r++;
        }
        return max;
    }
}
