class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode nodeBeforeA = list1;
        for (int i = 0; i < a - 1; i++) {
            nodeBeforeA = nodeBeforeA.next;
        }

        ListNode nodeAfterB = nodeBeforeA;
        for (int i = a - 1; i <= b; i++) {
            nodeAfterB = nodeAfterB.next;
        }

        ListNode list2Tail = list2;
        while (list2Tail.next != null) {
            list2Tail = list2Tail.next;
        }

        nodeBeforeA.next = list2;
        list2Tail.next = nodeAfterB;  

        return list1;                 
    }
}