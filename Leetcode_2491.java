/*
  2491. Divide Players Into Teams of Equal Skill --> (04/10/2024) --> (Medium)

You are given a positive integer array skill of even length n where skill[i] denotes the skill of the ith player.
Divide the players into n / 2 teams of size 2 such that the total skill of each team is equal.

The chemistry of a team is equal to the product of the skills of the players on that team.

Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into
teams such that the total skill of each team is equal.

Example 1:

Input: skill = [3,2,5,1,3,4]
Output: 22
Explanation:
Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6.
The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.

Example 2:

Input: skill = [3,4]
Output: 12
Explanation:
The two players form a team with a total skill of 7.
The chemistry of the team is 3 * 4 = 12.

Example 3:

Input: skill = [1,1,2,3]
Output: -1
Explanation:
There is no way to divide the players into teams such that the total skill of each team is equal.

Constraints:

2 <= skill.length <= 105
skill.length is even.
1 <= skill[i] <= 1000
 */

import java.util.*;
public class Leetcode_2491
{
    public static void main(String[] args)
    {
        int[] skill = {3,2,5,1,3,4};
        System.out.println(dividePlayers(skill));
    }

    public static long dividePlayers(int[] skill)
    {
        long out = 0;
        Arrays.sort(skill);
        int i = 0,j = skill.length - 1;
        int sum = skill[0] + skill[skill.length - 1];
        while(i <= j)
        {
            if(sum == skill[i] + skill[j])
            {
                out += (long) skill[i] * skill[j];
            }
            else
            {
                return -1;
            }
            i++;
            j--;
        }
        return out;
    }
}
