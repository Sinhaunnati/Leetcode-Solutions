class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }

        int baseSize = len / k;   
        int extra = len % k;      

        ListNode[] result = new ListNode[k];
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            if (curr == null) {
                result[i] = null;
                continue;
            }

            result[i] = curr;
            int partSize = baseSize + (i < extra ? 1 : 0);

            for (int j = 0; j < partSize - 1; j++) {
                curr = curr.next;
            }

            
            ListNode next = curr.next;
            curr.next = null;
            curr = next;
        }

        return result;
    }
}