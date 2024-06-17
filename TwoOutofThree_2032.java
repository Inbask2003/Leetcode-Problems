/*
  2032. Two Out of Three

  Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 

Example 1:

Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.

Example 2:

Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
Output: [2,3,1]
Explanation: The values that are present in at least two arrays are:
- 2, in nums2 and nums3.
- 3, in nums1 and nums2.
- 1, in nums1 and nums3.

Example 3:

Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
Output: []
Explanation: No value is present in at least two arrays.
*/

import java.util.*;
public class TwoOutofThree_2032 
{
    public static void main(String args[])
    {
        int nums1[] = {1,1,3,2};
        int nums2[] = {2,3};
        int nums3[] = {3};
        List<Integer> out = new ArrayList<Integer>();
        out = twoOutOfThree(nums1,nums2,nums3);
        for(int i : out)
        {
            System.out.println(i);
        }
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        List<Integer> out = new ArrayList<Integer>();

        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int num : nums1)
        {
            set1.add(num);
        }

        for(int num :nums2)
        {
            if(set1.contains(num) && out.contains(num) == false)
            {
                out.add(num);
            }
            else
            {
                set2.add(num);
            }
        }

        for(int num : nums3)
        {
            if(set1.contains(num) || set2.contains(num))
            {
                if(out.contains(num) == false)
                {
                    out.add(num);
                }
                
            }
        }
        return out;
    }
}
