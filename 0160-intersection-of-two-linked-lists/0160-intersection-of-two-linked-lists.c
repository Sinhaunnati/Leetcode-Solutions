/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    
    struct ListNode *tempA;
    struct ListNode *tempB = headB;

    while(tempB != NULL){
        tempA = headA;   

        while(tempA != NULL){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA->next;
        }

        tempB = tempB->next;
    }

    return NULL;
}

    