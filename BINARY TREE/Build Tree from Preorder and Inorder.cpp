#include "bits/stdc++.h"
using namespace std;

struct Node{
    int data;
    struct Node* left;
    struct Node* right;

    Node(int val){
        data=val;
        left=NULL;
        right=NULL;
    }
};

int search(int inorder[], int start, int end, int curr){
    for(int i=start;i<=end;i++){
        if(inorder[i]==curr){
            return i;
        }
    }
    return -1; // it will never work bcz we have created curr node so it will always exist in order
}

Node* buildTree(int preorder[], int inorder[], int start, int end){
    static int idx= 0;

    if(start>end){
        return NULL;
    }

    int curr=preorder[idx];
    idx++;

    Node* node=new Node(curr);
    if(start==end){ //  if there is only one element in inorder not having any right and left subtree
        return node;
    }
    int pos= search(inorder,start,end,curr);
    node->left= buildTree(preorder, inorder, start, pos-1);
    node->right= buildTree(preorder, inorder, pos+1, end);

    return node;
}

// for printing inorder sequence so that we can check the root node built is correct or not
void inorderPrint(Node* root){
    // base case
    if(root==NULL){
        return;
    }

    inorderPrint(root->left);
    cout<<root->data<<" ";
    inorderPrint(root->right);
}

int main(){
    int preorder[]= {1,2,4,3,5};
    int inorder[]= {4,2,1,5,3};

    // build tree
    Node* root= buildTree(preorder,inorder,0,4);
    inorderPrint(root);
    return 0;
}
