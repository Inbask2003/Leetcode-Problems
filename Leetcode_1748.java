/*
  1748. Sum of Unique Elements

  You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.

Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

import java.util.*;
public class Leetcode_1748
{
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums)
    {
        /* Brute Force Approach --> 58% beats in runtime
       int sum = 0;
       Map<Integer,Integer> map = new HashMap<>();
       for(int i : nums)
       {
           map.put(i,map.getOrDefault(i,0)+1);
       }
       for(Map.Entry<Integer,Integer> e : map.entrySet())
       {
           if(e.getValue() == 1)
           {
               sum+=e.getKey();
           }
       }
       return sum;
       */
        // Optimal Approach --> 100% beats in runtime
        int sum = 0;
        int out[] = new int[101];
        for(int i : nums)
        {
            out[i]++;
        }
        for(int i = 0;i < 101;i++)
        {
            if(out[i] == 1)
            {
                sum+=i;
            }
        }
        return sum;
    }

}
