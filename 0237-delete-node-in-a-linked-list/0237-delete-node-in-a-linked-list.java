/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        while(node.next != null){
            temp = node;
            node.val = node.next.val;
            node = node.next;
        }
        temp.next = null;
    }
}