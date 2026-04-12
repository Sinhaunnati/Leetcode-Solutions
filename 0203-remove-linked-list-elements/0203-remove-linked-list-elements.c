/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* curr=head;
    struct ListNode* temp;
    while(head != NULL && head->val == val){
        head = head->next;
    }
    if(curr != NULL)
        temp = curr->next;
    else
        temp = NULL;

    while(temp!=NULL){
        if(temp->val!=val){
            curr=curr->next;
            temp=temp->next;
        }
        else{
            curr->next=temp->next;
            temp=curr->next;
        }
    }
    return head;
    
}