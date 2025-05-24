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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            ListNode del = head;
            head = head.next;
            del.next = null;
        }
        if(head == null)return head;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.next.val == val){
                ListNode del = temp.next;
                temp.next = del.next;
                del.next = null;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}