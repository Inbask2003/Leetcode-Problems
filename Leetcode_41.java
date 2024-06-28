/*
  41. First Missing Positive

  Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.

Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing
 */

import java.util.*;
public class Leetcode_41
{
    public static void main(String[] args)
    {
        int nums[] = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums)
    {
        // HashSet is used to remove duplicates in nums array
        Set<Integer> s = new HashSet<>();

        for(int i : nums)
        {
            // non negative values are only stored
            if(i > 0)
            {
                s.add(i);
            }
        }

        // sort the array using list
        List<Integer> arr = new ArrayList<>(s);
        Collections.sort(arr);

        // if array size is zero then return first positive value as 1
        if(arr.size() == 0)
        {
            return 1;
        }
        // if array first element is not 1 then return value as 1
        else if(arr.get(0) > 1)
        {
            return 1;
        }
        else
        {
            for(int i = 0;i < arr.size()-1;i++)
            {
                // check the current value + 1 is equal to next value of the array
                if(arr.get(i)+1 != arr.get(i+1))
                {
                    return arr.get(i)+1;
                }
            }
        }

        // if all values are in array then return the array last element + 1
        return arr.get(arr.size()-1)+1;
    }

}
