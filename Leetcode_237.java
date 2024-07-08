public class Leetcode_237
{
    public static void main(String[] args)
    {


    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public static void deleteNode(ListNode node)
    {
            // here we don't use loop for iterate list we can only change the input node value with it's next node value and input node next with input node next.next
            node.val = node.next.val;
            node.next = node.next.next;
    }

}

class ListNode
{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val = val;
    }
}
