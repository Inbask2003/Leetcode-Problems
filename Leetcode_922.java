/*
  922. Sort Array By Parity II --> (16/07/2024) --> (Easy)

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.

Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:

Input: nums = [2,3]
Output: [2,3]

Constraints:

2 <= nums.length <= 2 * 104
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000
 */

/*
  Procedure :
  create one new array with length of given array
  first store new array's even index with even values of given array
  then store new array's odd index with odd values of given array
 */

public class Leetcode_922
{
    public static void main(String[] args)
    {
        int nums[] = {4,2,5,7};
        int out[] = sortArrayByParityII(nums);
        for(int i : out)
        {
            System.out.print(i+ " ");
        }
    }

    public static int[] sortArrayByParityII(int[] nums)
    {
        int l = nums.length;
        int out[] = new int[l];
        int count = 0;
        for(int i = 0;i < l;i++)
        {
            if(count % 2 == 0 && nums[i] % 2 == 0)
            {
                out[count] = nums[i];
                count+=2;
            }
        }
        count = 1;
        for(int i = 0;i < l;i++)
        {
            if(count % 2 == 1 && nums[i] % 2 == 1)
            {
                out[count] = nums[i];
                count+=2;
            }
        }
        return out;
    }
}
