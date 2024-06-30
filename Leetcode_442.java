/*
  442. Find All Duplicates in an Array

  Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

Example 2:

Input: nums = [1,1,2]
Output: [1]

Example 3:

Input: nums = [1]
Output: []
 */

import java.util.*;
public class Leetcode_442
{
    public static void main(String[] args)
    {
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> out = findDuplicates(nums);
        System.out.println(out);
    }

    public static List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> out = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i : nums)
        {
            // if array element is already in set then add it to out list
            if(set.contains(i))
            {
                out.add(i);
            }
            set.add(i);
        }

        return out;
    }

}
