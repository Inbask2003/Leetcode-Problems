/*
  3217. Delete Nodes From Linked List Present in Array --> (14/7/2024) --> (Medium)

You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.

Example 1:

Input: nums = [1,2,3], head = [1,2,3,4,5]
Output: [4,5]
Explanation:
Remove the nodes with values 1, 2, and 3.

Example 2:

Input: nums = [1], head = [1,2,1,2,1,2]
Output: [2,2,2]
Explanation:
Remove the nodes with value 1.

Example 3:

Input: nums = [5], head = [1,2,3,4]
Output: [1,2,3,4]
Explanation:
No node has value 5.

Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
All elements in nums are unique.
The number of nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105
The input is generated such that there is at least one node in the linked list that has a value not present in nums.
 */

import java.util.*;
public class Leetcode_3217
{
    public static void main(String[] args)
    {

    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

        public static ListNode modifiedList(int[] nums, ListNode head)
        {
            Set<Integer> set = new HashSet<>();

            for(int i : nums)
            {
                set.add(i);
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode temp = dummy;
            while(temp.next != null)
            {
                if(set.contains(temp.next.val))
                {
                    temp.next = temp.next.next;
                }
                else
                {
                    temp = temp.next;
                }
            }
            return dummy.next;
        }
}

class ListNode
{
    int val;
    ListNode next;
    ListNode()
    {

    }
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val; this.next = next;
    }
}

