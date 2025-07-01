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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        Stack<Integer> st = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            st.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)slow = slow.next;
        while(slow != null){
            if(slow.val != st.pop())return false;
            slow = slow.next;
        }
        return true;
    }
}