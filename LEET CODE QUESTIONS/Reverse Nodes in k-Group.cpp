/* 25. Reverse Nodes in k-Group
Hard
10.2K
558
Companies
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int getLength(ListNode* head)
    {
        int temp=0;
        while(head!=NULL)
        {
            temp++;
            head=head->next;
        }
        return temp;
    }

    ListNode* reverseKGroup(ListNode* head, int k) {
        //Calculate the length of node & check with k
        int length=getLength(head);
        if(k>length) 
        return head;

        ListNode* prevptr=NULL;
        ListNode* currptr=head;
        ListNode* nextptr;

        int count=0; // To check till where our first K nodes are
        while(currptr != NULL && count<k){ // Till then we'll reverse our list
            nextptr=currptr->next;
            currptr->next=prevptr;
            prevptr=currptr;
            currptr=nextptr;

            count++;
        }

        // Recursive call for rest of the list
        if(nextptr != NULL){
            head->next= reverseKGroup(nextptr,k);
        }
        // prevptr points to the new head
        return prevptr;
    }
};
