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
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next== null || head.next.next == null)
            return head;
        ListNode head2 = head.next;
        ListNode temp1 = head;
        ListNode temp2 = head2;
        while(temp1.next != null && temp2.next != null){
            temp1.next = temp2.next;
            temp1 = temp2.next;
            temp2.next = temp1.next;
            temp2 = temp1.next;
        }
        temp1.next = head2;
        return head;
    }
}