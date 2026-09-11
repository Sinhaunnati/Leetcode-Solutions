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
    public int[] nextLargerNodes(ListNode head) {
        
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] ans=new int[count];
        int k=0;
        temp=head;
        while(temp!=null){
            ans[k++]=temp.val;
            temp=temp.next;
        }

        int[] answer=new int[ans.length];
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<ans.length;i++){
            int largest=ans[i];
            for(int j=i+1;j<ans.length;j++){
                if(ans[j]>ans[i]){
                   answer[i]=ans[j];
                   break;
                }


                
            }

        }
        return answer;

    }
}