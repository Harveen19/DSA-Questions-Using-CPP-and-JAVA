// 21. Merge Two Sorted Lists
//Easy
//16.5K
//1.5K
//Companies
//You are given the heads of two sorted linked lists list1 and list2.

//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

//Return the head of the merged linked list.
 
//Example 1:

//Input: list1 = [1,2,4], list2 = [1,3,4]
//Output: [1,1,2,3,4,4]

//Example 2:

//Input: list1 = [], list2 = []
//Output: []

//Example 3:

//Input: list1 = [], list2 = [0]
//Output: [0]

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
    // ITERATIVE WAY
    /*ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* p1=list1;
        ListNode* p2=list2;
        ListNode* dummyNode=new ListNode(-1);
        ListNode* p3=dummyNode;
        
        while(p1!=NULL && p2!=NULL){
            if(p1->val < p2->val){
                p3->next=p1;
                p1=p1->next;
            }
            else{
                p3->next=p2;
                p2=p2->next;
            }
            p3=p3->next;
        }

        while(p1!=NULL){
            p3->next=p1;
            p1=p1->next;
            p3=p3->next;
        }

        while(p2!=NULL){
            p3->next=p2;
            p2=p2->next;
            p3=p3->next;
        }
        return dummyNode->next;
    }*/

    //RECURSIVE WAY
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
    if(list1==NULL){ // base case
       return list2; 
    }
    if(list2==NULL){
        return list1;
    }

    ListNode* result;
    if(list1->val < list2->val){
        result=list1;
        result->next=mergeTwoLists(list1->next, list2);
    }
    else{
        result=list2;
        result->next=mergeTwoLists(list1, list2->next);
    }
    return result;
}
};