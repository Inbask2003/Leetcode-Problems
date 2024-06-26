/*
  189. Rotate Array

  Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

public class Leetcode_189
{
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }

    public static void rotate(int[] nums, int k)
    {
        int l = nums.length;
        k = k % nums.length;
        rev(nums,0,l);
        rev(nums,0,k);
        rev(nums,k,l);
        for(int i : nums)
        {
            System.out.print(i+" ");
        }
    }

    public static int[] rev(int[] nums,int start,int end)
    {
        int i = start;
        int j = end-1;

        while(i <= j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return nums;
    }
}
