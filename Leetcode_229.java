/*
  229. Majority Element II --> (19/07/2024) --> (Medium)

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]

Example 2:

Input: nums = [1]
Output: [1]

Example 3:

Input: nums = [1,2]
Output: [1,2]

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */

import java.util.*;
public class Leetcode_229
{
    public static void main(String[] args)
    {
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> out = new ArrayList<>();
        int num = 0;
        if(nums.length < 3)
        {
            num = 1;
        }
        else
        {
            num = (nums.length/3)+1;
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() >= num)
            {
                out.add(e.getKey());
            }
        }
        return out;
    }
}
