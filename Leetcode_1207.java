/*
  1207. Unique Number of Occurrences --> (Easy)

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:

Input: arr = [1,2]
Output: false

Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
 */

import java.util.*;
public class Leetcode_1207
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr)
        {
            // store arr elements in map and if the element is repeated then increment the element value + 1
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            // the map value is repeatation of element and if that value is repeated then return false
            if(set.contains(e.getValue()))
            {
                return false;
            }
            set.add(e.getValue());
        }
        return true;
    }

}
