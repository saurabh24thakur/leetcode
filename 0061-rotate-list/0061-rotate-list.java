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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr=head;

        if (head == null || head.next == null) {
            return head;
        }

        int i=k;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        k=k%n;
        int t=n-k;

        if(k==0) return head;

        ListNode temp=null;
        curr=head;

        while(t-->1){
            curr=curr.next;

        }

        temp=curr.next;
        curr.next=null;
        ListNode newhead=temp;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;

        return newhead;
    }
}