/*
  1248. Count Number of Nice Subarrays --> (23/10/2024) --> (Medium)

Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

Example 2:

Input: nums = [2,4,6], k = 1
Output: 0
Explanation: There are no odd numbers in the array.

Example 3:

Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
Output: 16

Constraints:

1 <= nums.length <= 50000
1 <= nums[i] <= 10^5
1 <= k <= nums.length
 */

public class Leetcode_1248
{
    public static void main(String[] args)
    {
        int[] nums = {1,1,2,1,1};
        int k = 3;
        System.out.println(numberOfSubarrays(nums,k));
    }

    public static int numberOfSubarrays(int[] nums, int k)
    {
        int out = 0;
        int count = 0;
        int i = 0,j = 0;
        int temp = 0;
        while( i < nums.length)
        {
            if(nums[i] % 2 == 1)
            {
                temp = 0;
                count++;
            }
            while(count == k)
            {
                temp++;
                if(nums[j] % 2 == 1)
                {
                    count--;
                }
                j++;
            }
            out+=temp;
            i++;
        }
        return out;
    }
}
