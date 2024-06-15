/*
728. Self Dividing Numbers :

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].


Example 1:

Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

Example 2:

Input: left = 47, right = 85
Output: [48,55,66,77]

*/

import java.util.*;
public class SelfDividingNumber_728
{
    public static void main(String[] args) 
    {
        List<Integer> arr = selfDividingNumbers(1,22);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> out = new ArrayList<>();
        for(int i = left;i <= right;i++)
        {
            boolean flag = true;
            int temp = i;
            inner:
            while(temp > 0)
            {
                int val = temp % 10;
                if(val == 0)
                {
                    flag = false;
                    break inner;
                }
                if(i % val != 0)
                {
                    flag = false;
                    break inner;
                }
                temp/=10;
            }
            if(flag)
            {
                out.add(i);
            }
        }
        return out;
    }
}