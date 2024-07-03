/*
  1630. Arithmetic Subarrays

   A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every two consecutive elements is the same. More formally, a sequence s is arithmetic if and only if s[i+1] - s[i] == s[1] - s[0] for all valid i.

For example, these are arithmetic sequences:

1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic:

1, 1, 2, 5, 7
You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries, where the ith query is the range [l[i], r[i]]. All the arrays are 0-indexed.

Return a list of boolean elements answer, where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... , nums[r[i]] can be rearranged to form an arithmetic sequence, and false otherwise.

Example 1:

Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
Output: [true,false,true]
Explanation:
In the 0th query, the subarray is [4,6,5]. This can be rearranged as [6,5,4], which is an arithmetic sequence.
In the 1st query, the subarray is [4,6,5,9]. This cannot be rearranged as an arithmetic sequence.
In the 2nd query, the subarray is [5,9,3,7]. This can be rearranged as [3,5,7,9], which is an arithmetic sequence.

Example 2:

Input: nums = [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10], l = [0,1,6,4,8,7], r = [4,4,9,7,9,10]
Output: [false,true,false,false,true,true]

*/

import java.util.*;
public class Leetcode_1630
{
    public static void main(String[] args)
    {
        int nums[] = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int l[] = {0,1,6,4,8,7};
        int r[] = {4,4,9,7,9,10};
        System.out.println(checkArithmeticSubarrays(nums,l,r));
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r)
    {
        int left;
        int right;
        int count;
        List<Boolean> out = new ArrayList<>();
        boolean flag;

        // traverse the loop from 0 to l & r array length
        for(int i = 0;i < l.length;i++)
        {
            left = l[i];
            right = r[i];
            int arr[] = new int[right-left+1];
            count = 0;

            // store the left and right range num array values to temporary array
            while(left <= right)
            {
                arr[count] = nums[left];
                count++;
                left++;
            }

            // sort the temporary array
            Arrays.sort(arr);
            flag = true;

            inner:
            for(int j = 1;j < arr.length-1;j++)
            {

                // check the arr[1] - arr[0] == arr[2] - arr[1] store the value in flag variable
                if(arr[j] - arr[j-1] != arr[j+1] - arr[j])
                {
                    flag = false;
                    break inner;
                }
            }

            // add the flag variable value to out list
            out.add(flag);
        }

        // return out list
        return out;
    }

}
