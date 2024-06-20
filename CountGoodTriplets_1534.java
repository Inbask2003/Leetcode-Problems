/*
  1534. Count Good Triplets

  Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.

A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

0 <= i < j < k < arr.length
|arr[i] - arr[j]| <= a
|arr[j] - arr[k]| <= b
|arr[i] - arr[k]| <= c
Where |x| denotes the absolute value of x.

Return the number of good triplets.

 

Example 1:

Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
Output: 4
Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].

Example 2:

Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
Output: 0
Explanation: No triplet satisfies all conditions.
 */
public class CountGoodTriplets_1534 
{
    public static void main(String[] args) 
    {
        int a = 7,b = 2,c = 3;
        int nums[] = {3,0,1,1,9,7};
        System.out.println(countGoodTriplets(nums, a, b, c));
    }
    
    public static int countGoodTriplets(int[] nums, int a, int b, int c) 
    {
        int count = 0;
        int l = nums.length;
        for(int i = 0;i < l-2;i++)
        {
            for(int j = i+1;j < l-1;j++)
            {
                boolean c1 = Math.abs(nums[i] - nums[j]) <= a;
                if(c1)
                {
                    for(int k = j+1;k < l;k++)
                    {
                        boolean c2 = Math.abs(nums[j] - nums[k]) <= b;
                        boolean c3 = Math.abs(nums[i] - nums[k]) <= c;
                        if(c2 && c3)
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
