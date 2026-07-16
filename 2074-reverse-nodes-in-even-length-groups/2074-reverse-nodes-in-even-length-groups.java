class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode prev = head;
        int groupSize = 2;
        ListNode curr = head.next;

        while (curr != null) {
            int count = 0;
            ListNode node = curr;
            while (node != null && count < groupSize) {
                node = node.next;
                count++;
            }

            if (count % 2 == 0) {
                ListNode tail = curr;
                ListNode prevNode = node;
                for (int i = 0; i < count; i++) {
                    ListNode nxt = tail.next;
                    tail.next = prevNode;
                    prevNode = tail;
                    tail = nxt;
                }
                prev.next = prevNode;
                prev = curr;
            } else {
                for (int i = 0; i < count; i++) {
                    prev = prev.next;
                }
            }

            curr = node;
            groupSize++;
        }

        return head;
    }
}