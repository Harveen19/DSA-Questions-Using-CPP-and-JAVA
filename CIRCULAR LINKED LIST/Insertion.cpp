#include<iostream>
using namespace std;

class node{
    public:
    int data;
    node* next;

    node(int val){
        data=val;
        next=NULL;
    }
};

void insertAtHead(node* &head, int val){
    node* n=new node(val);
    if(head==NULL){
        n->next=n;
        head=n;
        return;
    }
    node* temp=head;

    while(temp->next!=head){
        temp=temp->next;
    }

    temp->next=n;
    n->next=head;
    head=n;
}

void insertAttail(node* &head, int val){

    // if our list in null then we'll create a new function
    if(head==NULL){
        insertAtHead(head,val);
        return;
    }
    node* n = new node(val);
    node* temp=head;

    while(temp->next!=head){
        temp=temp->next;
    }

    temp->next=n;
    n->next=head;
}

void display(node* head){
    node* temp=head;
    do
    {
        /* code */
        cout<<temp->data<<" ";
        temp=temp->next;
    } while(temp!=head);
    cout<<endl;
    
}

int main(){
    node* head=NULL;
    insertAttail(head,1);
    insertAttail(head,2);
    insertAttail(head,3);
    insertAttail(head,4);
    display(head);

    insertAtHead(head,5);
    display(head);

    return 0;
}