import java.util.*;

public class LL
{
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        
        currNode.next = newNode;
    }
    
    // ITERATIVE METHOD
    public void reverseIterative(){
        if(head == null || head.next == null){
            return;
        }
        
        Node prevNode = head;
        Node currNode = head.next;
        
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        
        head.next = null;
        head = prevNode; 
    }
    
    // RECURSIVE METHOD
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node newHead = reverseRecursive(head.next); // it will be returning new head
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }
    
    public void printLL(){
        if(head == null){
            System.out.println("null");
            return;
        }
        
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        
        System.out.println("null");
    }
    
	public static void main(String[] args) {
	    LL list = new LL();
	    list.addLast(1);
	    list.addLast(2);
	    list.addLast(3);
	    list.addLast(4);
	    list.addLast(5);
	    
	    list.printLL();
	    
	    //list.reverseIterative();
	    //list.printLL();
	    
	    list.head = list.reverseRecursive(list.head);
	    list.printLL();
	}
}

// Space Complexity = O(1) means constant space to be used 
// And if it is given O(n) then we will make new linked list and travel at the first linked list's last node and in new linked list by coming back adding the elements one by one 
