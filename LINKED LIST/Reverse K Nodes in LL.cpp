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

void insertAtTail(node* &head, int val){

    node* n= new node(val);
    if(head==NULL){
        head=n;
        return;
    }
    node* temp=head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
}

void display(node* head){
    node* temp=head;
    while (temp!=NULL)
    {
        /* code */
        cout<<temp->data<<"->";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}

node* reverseK(node* &head, int k){
    node* prevptr=NULL;
    node* currptr=head;
    node* nextptr;

    int count=0; // To check till where our first K nodes are
    while(currptr != NULL && count<k){ // Till then we'll reverse our list
        nextptr=currptr->next;
        currptr->next=prevptr;

        prevptr=currptr;
        currptr=nextptr;
        count++;
    }

    // Recursive call for rest of list
    if(nextptr != NULL){
    head->next = reverseK(nextptr,k);
    }
    // prevptr points to the new head
    return prevptr;
}

int main(){
    node* head=NULL;
    insertAtTail(head,1);
    insertAtTail(head,2);
    insertAtTail(head,3);
    insertAtTail(head,4);
    insertAtTail(head,5);
    insertAtTail(head,6);

    display(head);
    int k=2;
    node* newhead= reverseK(head,k);
    display(newhead);

    return 0;
}

// O(n) complexity bcz we're traversing our linked list only once