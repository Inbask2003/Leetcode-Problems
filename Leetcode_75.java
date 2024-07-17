/*
  75. Sort Colors --> (17/07/2024) --> (Medium)

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */

/*
  Procdeurs :
  declare three variables zero,one,two initially there values are 0
  iterate the given array through loop and if the array element is
                     zero then zero++
                     one then one++
                     two then two++
  loop the array upto zero time and modify given array value with 0
  loop the array from zero to zero+one time and modify given array value with 1
  loop the array zero+one to zero+one+two time and modify given array value with 2
  */

public class Leetcode_75
{
    public static void main(String[] args)
    {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
        for(int i : nums)
        {
            System.out.print(i+" ");
        }
    }

    public static void sortColors(int[] nums)
    {
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i : nums)
        {
            if(i == 0)
            {
                zero++;
            }
            else if(i == 1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        for(int i = 0;i < zero;i++)
        {
            nums[i] = 0;
        }
        for(int i = zero;i < zero+one;i++)
        {
            nums[i] = 1;
        }
        for(int i = zero+one;i < zero+one+two;i++)
        {
            nums[i] = 2;
        }
    }
}
