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
    public ListNode removeZeroSumSublists(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    
    Map<Integer, ListNode> seen = new HashMap<>();
    int prefix = 0;
    
    // First pass: record the LAST node seen at each prefix sum
    ListNode node = dummy;
    while (node != null) {
        prefix += node.val;
        seen.put(prefix, node);
        node = node.next;
    }
    
    // Second pass: skip over zero-sum segments
    prefix = 0;
    node = dummy;
    while (node != null) {
        prefix += node.val;
        node.next = seen.get(prefix).next;
        node = node.next;
    }
    
    return dummy.next;
        
    }
}