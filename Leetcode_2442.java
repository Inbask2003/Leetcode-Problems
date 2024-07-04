/*
  2442. Count Number of Distinct Integers After Reverse Operations

  You are given an array nums consisting of positive integers.

You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.

Return the number of distinct integers in the final array.

Example 1:

Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).

Example 2:

Input: nums = [2,2,2]
Output: 1
Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
The number of distinct integers in this array is 1 (The number 2).

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 106
 */

import java.util.*;
public class Leetcode_2442
{
    public static void main(String[] args)
    {
        int nums[] = {1,13,10,12,31};
        System.out.println(countDistinctIntegers(nums));
    }

    public static int countDistinctIntegers(int[] nums)
    {
        Set<Integer> set = new HashSet<>();

        // copy the all elements from nums array to set
        for(int i : nums)
        {
            set.add(i);
        }

        for(int i = 0;i < nums.length;i++)
        {
            int num = 0;
            int val = nums[i];

            // reverse the nums array elements
            while(val > 0)
            {
                int temp = val % 10;
                num = (num * 10) + temp;
                val/=10;
            }

            // add the reverse value of nums array elements to the set
            set.add(num);
        }
        return set.size();
    }

}
