/* 
 2475. Number of Unequal Triplets in Array

 You are given a 0-indexed array of positive integers nums. Find the number of triplets (i, j, k) that meet the following conditions:

0 <= i < j < k < nums.length
nums[i], nums[j], and nums[k] are pairwise distinct.
In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
Return the number of triplets that meet the conditions.

 

Example 1:

Input: nums = [4,4,2,4,3]
Output: 3
Explanation: The following triplets meet the conditions:
- (0, 2, 4) because 4 != 2 != 3
- (1, 2, 4) because 4 != 2 != 3
- (2, 3, 4) because 2 != 4 != 3
Since there are 3 triplets, we return 3.
Note that (2, 0, 4) is not a valid triplet because 2 > 0.

Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: No triplets meet the conditions so we return 0.
*/

public class NumberofUnequalTripletsinArray_2475 
{
    public static void main(String[] args) 
    {
        int nums[] = {4,4,2,4,3};
        System.out.println(unequalTriplets(nums));
    }
    
    public static int unequalTriplets(int[] nums) 
    {
        int count = 0;
        int l = nums.length;
        
        for(int i = 0;i < l-2;i++)
        {
            for(int j = i+1;j < l-1;j++)
            {
                if(nums[i] != nums[j])
                {
                    for(int k = j+1;k < l;k++)
                    {
                        if( nums[j] != nums[k] && nums[k] != nums[i])
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
