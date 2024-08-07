/*
  2248. Intersection of Multiple Arrays

  Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.

Example 1:

Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
Output: [3,4]
Explanation:
The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].

Example 2:

Input: nums = [[1,2,3],[4,5,6]]
Output: []
Explanation:
There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].

Constraints:

1 <= nums.length <= 1000
1 <= sum(nums[i].length) <= 1000
1 <= nums[i][j] <= 1000
All the values of nums[i] are unique.

 */

import java.util.*;
public class Leetcode_2248
{
    public static void main(String[] args)
    {
        int nums[][] = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }

    public static List<Integer> intersection(int[][] nums)
    {
        List<Integer> out = new ArrayList<>();
        int arr[] = new int[1001];

        for(int i = 0;i < nums.length;i++)
        {
            for(int j = 0;j < nums[i].length;j++)
            {
                arr[nums[i][j]]++;
            }
        }

        for(int i = 0;i < 1001;i++)
        {
            if(arr[i] == nums.length)
            {
                out.add(i);
            }
        }

        return out;

    /*
       Map<Integer,Integer> map = new HashMap<>();
       List<Integer> out = new ArrayList<>();

       for(int i[] : nums)
       {
           for(int j : i)
           {
               map.put(j,map.getOrDefault(j,0)+1);
           }
       }

       for(Map.Entry<Integer,Integer> e : map.entrySet())
       {
           if(e.getValue() == nums.length)
           {
               out.add(e.getKey());
           }
       }

       Collections.sort(out);
       return out;
    */
    }

}
