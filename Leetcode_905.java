/*
  905. Sort Array By Parity --> (15/07/2024) --> (Easy)

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:

Input: nums = [0]
Output: [0]

Constraints:

1 <= nums.length <= 5000
0 <= nums[i] <= 5000
 */

/*
  Procedure :

  take two pointer i & j initial value of i = 0 & j = 0
  if nums[i] is even swap with nums[j] value and j++
  else i++
*/

public class Leetcode_905
{
    public static void main(String[] args)
    {
        int nums[] = {3,1,2,4};
        int out[] = sortArrayByParity(nums);
        for(int i : out)
        {
            System.out.print(i+" ");
        }
    }

    public static int[] sortArrayByParity(int[] nums)
    {
        // Optimal Solution Beats 100%
        int i = 0;
        int j = 0;
        int temp = 0;
        int l = nums.length;
        while(i < l)
        {
            if(nums[i] % 2 == 0)
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return nums;
        /* Brute Force 60% Beats
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i : nums)
        {
            if(i % 2 == 0)
            {
                even.add(i);
            }
            else
            {
                odd.add(i);
            }
        }
        int i = 0;
        int count = 0;
        while(i < even.size())
        {
            nums[count++] = even.get(i);
            i++;
        }
        i = 0;
        while(i < odd.size())
        {
            nums[count++] = odd.get(i);
            i++;
        }
        return nums;
        */
    }
}
