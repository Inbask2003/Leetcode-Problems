/*
  234. Palindrome Linked List --> (14/07/2024) --> (Easy)

Given the head of a singly linked list, return true if it is a
palindrome or false otherwise.

Example 1:

Input: head = [1,2,2,1]
Output: true

Example 2:

Input: head = [1,2]
Output: false

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */

public class Leetcode_234
{
    public static void main(String[] args)
    {
        ListNode n5 = new ListNode(1,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(4,n3);
        ListNode n1 = new ListNode(1,n2);
        System.out.println(isPalindrome(n1));
    }

    public static boolean isPalindrome(ListNode head)
    {
        ListNode temp = head;
        int l = 0;
        // find the length of linked list
        while(head != null)
        {
            l++;
            head = head.next;
        }
        // create an array length of linked list
        int out[] = new int[l];
        l = 0;
        // store the all values of linked list to array
        while(temp.next != null)
        {
            out[l++] = temp.val;
            temp = temp.next;
        }
        out[l] = temp.val;
        int i = 0;
        int j = out.length-1;
        // check the array is palindrome or not
        while(i <= j)
        {
            if(out[i] != out[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
