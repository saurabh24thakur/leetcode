class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half of the list starting from `slow`
        ListNode secondHalfHead = reverseList(slow);
        ListNode firstHalfHead = head;

        // 3. Compare values of both halves
        ListNode p1 = firstHalfHead;
        ListNode p2 = secondHalfHead;
        boolean isPalin = true;

        while (p2 != null) { // second half is shorter or equal in length
            if (p1.val != p2.val) {
                isPalin = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // Optional: Restore the list structure before returning
        // reverseList(secondHalfHead);

        return isPalin;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }
}