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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }

        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0){
            return head;

        }
        k=k%len;
        tail.next=head;

        ListNode newLastNode=findNthNode(head,len-k);
        head=newLastNode.next;
        newLastNode.next=null;
        return head;


        
    }
    private ListNode findNthNode(ListNode head,int k){
        int count=1;
        ListNode temp=head;
        while(temp!=null){
            if(count==k){
                return temp;
            }
            count++;
            temp=temp.next;
        }
        return temp;
    }
    
}