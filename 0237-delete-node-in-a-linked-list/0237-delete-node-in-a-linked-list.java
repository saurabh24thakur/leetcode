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
        
        // Copy data from the next node
        node.val = node.next.val;
        // Point to the node after the next node
        node.next = node.next.next;
    
    }
}