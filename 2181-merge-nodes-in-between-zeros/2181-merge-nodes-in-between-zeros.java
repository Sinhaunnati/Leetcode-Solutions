class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode modify = head.next;
        ListNode curr = modify.next;

        while (curr != null) {
            if (curr.val != 0) {
                modify.val += curr.val;
                curr = curr.next;
            } else {
                curr = curr.next;
                if (curr != null) {
                    modify.next = curr;
                    modify = curr;
                    curr = curr.next;
                } else {
                    modify.next = null;
                }
            }
        }
        return head.next;
    }
}