/*
  2859. Sum of Values at Indices With K Set Bits

   You are given a 0-indexed integer array nums and an integer k.

Return an integer that denotes the sum of elements in nums whose corresponding indices have exactly k set bits in their binary representation.

The set bits in an integer are the 1's present when it is written in binary.

For example, the binary representation of 21 is 10101, which has 3 set bits.


Example 1:

Input: nums = [5,10,1,5,2], k = 1
Output: 13
Explanation: The binary representation of the indices are:
0 = 0002
1 = 0012
2 = 0102
3 = 0112
4 = 1002
Indices 1, 2, and 4 have k = 1 set bits in their binary representation.
Hence, the answer is nums[1] + nums[2] + nums[4] = 13.

Example 2:

Input: nums = [4,3,2,1], k = 2
Output: 1
Explanation: The binary representation of the indices are:
0 = 002
1 = 012
2 = 102
3 = 112
Only index 3 has k = 2 set bits in its binary representation.
Hence, the answer is nums[3] = 1.
 */

import java.util.*;
public class Leetcode_2859
{
    public static void main(String args[])
    {
        List<Integer> nums = new ArrayList<Integer>(Arrays.asList(5,10,1,5,2));
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(nums,k));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k)
    {
        // Optimal Solution
        int sum = 0;
        int l = nums.size();
        for(int i = 0;i < l;i++)
        {
            if(Integer.bitCount(i) == k)
            {
                sum+=nums.get(i);
            }
        }
        return sum;

        /*
        Brute Force :

        int sum = 0;
        int l = nums.size();
        for(int i = 0;i < l;i++)
        {
            int val = i;
            int count = 0;
            while(val > 0)
            {
                int temp = val % 2;
                if(temp == 1)
                {
                    count++;
                }
                val/=2;
            }
            if(count == k)
            {
                sum+=nums.get(i);
            }
        }
        return sum;
        */
    }
}
