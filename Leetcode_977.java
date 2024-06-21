/* 
  977. Squares of a Sorted Array

  Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.


Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*/

import java.util.ArrayList;
import java.util.Collections;

public class Leetcode_977 
{
    public static void main(String args[])
    {
        int nums[] = {-4,-1,0,3,10};
        int out[] = sortedSquares(nums);
        for(int i : out)
        {
            System.out.print(i+" ");
        }
    }

    public static int[] sortedSquares(int[] nums) 
    {
        int l = nums.length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int out[] = new int[l];

        for(int i = 0;i < l;i++)
        {
            arr.add(nums[i] * nums[i]);
        }   

        Collections.sort(arr);

        for(int i = 0;i < l;i++)
        {
            out[i] = arr.get(i);
        }
        
        return out;
    }
    
}
