/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* copyList(struct ListNode* head){
    if(head == NULL) return NULL;

    struct ListNode* newHead = NULL;
    struct ListNode* tail = NULL;

    while(head != NULL){
        struct ListNode* newNode = malloc(sizeof(struct ListNode));
        newNode->val = head->val;
        newNode->next = NULL;

        if(newHead == NULL){
            newHead = newNode;
            tail = newNode;
        }
        else{
            tail->next = newNode;
            tail = newNode;
        }

        head = head->next;
    }

    return newHead;
}

struct ListNode* reverseList(struct ListNode* head){
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* next;

    while(curr != NULL){
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}

bool isPalindrome(struct ListNode* head) {

    struct ListNode* copy = copyList(head);
    struct ListNode* reversed = reverseList(copy);

    while(head != NULL && reversed != NULL){
        if(head->val != reversed->val){
            return false;
        }

        head = head->next;
        reversed = reversed->next;
    }

    return true;
}