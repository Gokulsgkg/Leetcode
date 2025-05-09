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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode newHead = new ListNode(-1);
        ListNode dummy = newHead;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                dummy.next = new ListNode(t1.val);
                dummy = dummy.next;
                t1 = t1.next;
            }else{
                dummy.next = new ListNode(t2.val);
                dummy = dummy.next;
                t2 = t2.next;
            }
        }
        while(t1 != null){
            dummy.next = new ListNode(t1.val);
            dummy = dummy.next;
            t1 = t1.next;
        }
        while(t2 != null){
            dummy.next = new ListNode(t2.val);
            dummy = dummy.next;
            t2 = t2.next;
        }
        return newHead.next;
    }
}