/*
   1732. Find the Highest Altitude

   There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.


Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

 */

public class Leetcode_1732
{
    public static void main(String[] args)
    {
        int gain[] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain)
    {
        int l = gain.length;
        int alt;
        int max = 0;
        int start = 0;
        for(int i = 0;i < l;i++)
        {
            // gain[i] = altidue[i+1] - altitude[i];
            // alt[i] = altitude[i+1] - gain[i]
            // gain[0] = 0 + (gain[0]) ==> -5 = 0 + (-5), (-5) + 1 = -4 this is the reverse type solution
            alt = start + gain[i];
            max = Math.max(max,alt);
            start = alt;
        }
        return max;
    }

}
