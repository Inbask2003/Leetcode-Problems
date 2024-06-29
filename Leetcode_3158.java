/*
  3158. Find the XOR of Numbers which Appears Twice

  You are given an array nums, where each number in the array appears either once or twice.

Return the bitwise XOR of all the numbers that appear twice in the array, or 0 if no number appears twice.


Example 1:

Input: nums = [1,2,1,3]

Output: 1

Explanation:

The only number that appears twice in nums is 1.

Example 2:

Input: nums = [1,2,3]

Output: 0

Explanation:

No number appears twice in nums.

Example 3:

Input: nums = [1,2,2,1]

Output: 3

Explanation:

Numbers 1 and 2 appeared twice. 1 XOR 2 == 3.

*/

public class Leetcode_3158
{
    public static void main(String[] args)
    {
        int nums[] = {1,2,2,1};
        System.out.println(duplicateNumbersXOR(nums));
    }

    public static int duplicateNumbersXOR(int[] nums)
    {
        //constraint size of the array
        int out[] = new int[51];
        int xor = 0;
        for(int i : nums)
        {
            // if the element of array repeated it increase the value
            out[i]++;
            if(out[i] == 2)
            {
                xor^=i;
            }
        }
        // return the final xor value
        return xor;
    }

}
