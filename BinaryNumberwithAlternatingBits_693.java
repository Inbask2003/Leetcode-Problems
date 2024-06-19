/*
693. Binary Number with Alternating Bits

Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101

Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.

Example 3:

Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
*/
public class BinaryNumberwithAlternatingBits_693 
{
    public static void main(String args[])
    {
        System.out.println(hasAlternatingBits(11));
    }

    public static boolean hasAlternatingBits(int n) 
    {
        boolean flag = true;
        String s = Integer.toBinaryString(n);
        int l = s.length();
        for(int i = 0;i < l-1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
