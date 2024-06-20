/*
  1343. Number of Subarrays of Size K and Average greater than or Equal to Threshold

  Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).

Example 2:

Input: arr = [11,13,17,23,29,31,7,5,2,3], k = 3, threshold = 5
Output: 6
Explanation: The first 6 sub-arrays of size 3 have averages greater than 5. Note that averages are not integers.
*/

public class Leetcode_1343 
{
    public static void main(String[] args) 
    {
        int arr[] = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
    
    public static int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int l = arr.length;
        int count = 0;
        int sum = 0;
        for(int i = 0;i < k;i++)
        {
            sum+=arr[i];
        }   
        if(sum/k >= threshold)
        {
            count++;
        }
        for(int j = 1;j <= l-k;j++)
        {
            sum = sum - arr[j-1]+arr[j+k-1];
            if(sum/k >= threshold)
            {
                count++;
            }
        }
        return count;
    }
}
