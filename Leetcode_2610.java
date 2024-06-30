/*
  2610. Convert an Array Into a 2D Array with Conditions

  ou are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

The 2D array should contain only the elements of the array nums.
Each row in the 2D array contains distinct integers.
The number of rows in the 2D array should be minimal.
Return the resulting array. If there are multiple answers, return any of them.

Note that the 2D array can have a different number of elements on each row.

Example 1:

Input: nums = [1,3,4,1,2,3,1]
Output: [[1,3,4,2],[1,3],[1]]
Explanation: We can create a 2D array that contains the following rows:
- 1,3,4,2
- 1,3
- 1
All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
It can be shown that we cannot have less than 3 rows in a valid array.

Example 2:

Input: nums = [1,2,3,4]
Output: [[4,3,2,1]]
Explanation: All elements of the array are distinct, so we can keep all of them in the first row of the 2D array.
 */

import java.util.*;
public class Leetcode_2610
{
    public static void main(String[] args)
    {
        int nums[]  = {1,3,4,1,2,3,1};
        List<List<Integer>> out = findMatrix(nums);
        System.out.println(out);
    }

    public static List<List<Integer>> findMatrix(int[] nums)
    {
        List<List<Integer>> out = new ArrayList<>();
        // constraint lenght of input array
        int arr[] = new int[201];
        int l = nums.length;
        int i;
        //store the given input array in our array with initial value 1
        for(i = 0;i <l;i++)
        {
            arr[nums[i]]++;
        }
        int j = 0;
        while(j < l)
        {
            List<Integer> in = new ArrayList<>();
            for(i = 0;i < 201;i++)
            {
                // if array value does not 0 store in list using index
                if(arr[i] != 0)
                {
                    in.add(i);
                    // change the array value to 0 using index
                    arr[i]--;
                }
            }
            //if in list size greater than 0 then add it in out list
            if(in.size() > 0)
            {
                out.add(in);
            }
            j++;
        }
        return out;
    }

}
