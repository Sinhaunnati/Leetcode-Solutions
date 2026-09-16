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

    private ListNode findMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private ListNode reverseLL(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }

    public int pairSum(ListNode head) {
        ListNode middle=findMiddle(head);
        middle=reverseLL(middle.next);
        ListNode temp=head;
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        while(temp!=null && middle!=null){
            sum=temp.val+middle.val;
            maxi=Math.max(maxi,sum);
            temp=temp.next;
            middle=middle.next;

        }
        return maxi;

        
        
    }
}