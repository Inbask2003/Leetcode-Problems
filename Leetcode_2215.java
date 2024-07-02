/*
  2215. Find the Difference of Two Arrays

  Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
Note that the integers in the lists may be returned in any order.

Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 */

import java.util.*;
public class Leetcode_2215
{
    public static void main(String[] args)
    {
        int nums1[] = {1,2,3};
        int nums2[] = {2,4,6};
        System.out.println(findDifference(nums1,nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2)
    {
        List<List<Integer>> out = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // copy distinct element from nums1 array to set1
        for(int i : nums1)
        {
            set1.add(i);
        }

        // copy distinct element from nums2 array to set2
        for(int i : nums2)
        {
            set2.add(i);
        }

        List<Integer> l1 = new ArrayList<>();
        for(int i : set1)
        {
            // if set2 does not contains set1 elements add to list1
            if(!(set2.contains(i)))
            {
                l1.add(i);
            }
        }
        // add list1 to out list
        out.add(l1);

        List<Integer> l2 = new ArrayList<>();

        for(int i : set2)
        {
            // if set1 does not contains set2 elements add to list1
            if(!(set1.contains(i)))
            {
                l2.add(i);
            }
        }
        // add list2 to out list
        out.add(l2);

        return out;
    }

}
