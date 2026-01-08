class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode point = curr;

        while (point.next != null && point.next.next != null) {
            ListNode node1 = point.next;
            ListNode node2 = point.next.next;

            node1.next = node2.next;
            node2.next = node1;
            point.next = node2;

            point = node1;
        }

        return curr.next;
    }
}