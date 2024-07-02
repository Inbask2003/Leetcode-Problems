/*
  350. Intersection of Two Arrays 2

  Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */

import java.util.*;
public class Leetcode_350
{
    public static void main(String[] args)
    {
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int out[] = intersect(nums1,nums2);
        for(int i : out)
        {
            System.out.print(i+" ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums1)
        {
            // put the values in map and if the element is repeated increment value + 1
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : nums2)
        {
            // if the map contains the same elementthen add it to list and decrement value -1
            if(map.containsKey(i))
            {
                list.add(i);
                map.put(i,map.get(i)-1);
                // if the value of key is 0 then remove from it in map
                if(map.get(i) == 0)
                {
                    map.remove(i);
                }
            }
        }
        // copy the values in arraylist to array
        int out[] = new int[list.size()];
        for(int i = 0;i < list.size();i++)
        {
            out[i] = list.get(i);
        }
        return out;
    }

}
