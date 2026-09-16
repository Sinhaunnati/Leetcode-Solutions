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
    private ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head=reverseLL(head);
        ListNode curr=head;
        int maxi=curr.val;

        while(curr!=null && curr.next!=null){
            if(curr.next.val < maxi){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
                maxi=curr.val;
            }

        }
        head=reverseLL(head);
        return head;


       

        
    }
}