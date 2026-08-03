/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       
        // Boundary check
        if (headA == null || headB == null) return null;

        ListNode pA = headA;
        ListNode pB = headB;

        // Loop until the two pointers meet
        while (pA != pB) {
            // If pA reaches the end, move it to headB, else move to next node
            pA = (pA == null) ? headB : pA.next;
            
            // If pB reaches the end, move it to headA, else move to next node
            pB = (pB == null) ? headA : pB.next;
        }

        // Return either the intersection node or null if no intersection exists
        return pA;
    }
}