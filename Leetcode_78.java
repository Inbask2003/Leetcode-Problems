/* 
  78. Subsets

  Given an integer array nums of unique elements, return all possible subsets
  (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:

Input: nums = [0]
Output: [[],[0]]
*/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_78 
{
    public static void main(String args[])
    {
        int nums[] = {1,2,3};
        List<List<Integer>> out = subsets(nums);
        System.out.print("{");
        for(List<Integer> num : out)
        {
            System.out.print("{");
           for(int i : num)
           {
            System.out.print(i+",");
           }
           System.out.print("},");
        }
        System.out.println("}");
    }

    public static List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> out = new ArrayList<>(); 
        int l = nums.length;
        for(int i = 0;i < (int)Math.pow(2,l);i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j < l;j++)
            {
                if((i & (1 << j)) == (1 << j))
                {
                    temp.add(nums[j]);
                }
            }
            out.add(temp);
        }
       return out;
    }
}
