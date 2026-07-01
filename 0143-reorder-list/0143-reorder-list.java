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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return ;
            }
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.next.next==null){
                break;

            }
            ListNode tail=FindTail(head);
            tail.next=temp.next;
            temp.next=tail;
            temp=temp.next.next;
        }
        return ;


        
    }
    private ListNode FindTail(ListNode head){
        if(head==null || head.next==null){
            return head;
            }
            ListNode tail=head;
            ListNode prevtail=null;

            while(tail.next!=null){
                prevtail=tail;
                tail=tail.next;
            }
            if(prevtail!=null){
                prevtail.next=null;
            }
            return tail;
        
    }
}