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
    
    public Node removeNthFromEnd(Node head, int n){
        if(head.next == null){
            return null;
        }
        
        // size
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        
        // removing SIZEth node from last i.e. head
        if(n == size){
            return head.next;
        }
   
        // find previous node
        int indexToSearch = size-n;
        Node prev = head;
        int i=1;
        
        while(i < indexToSearch){
            prev = prev.next;
            i++;
        }
        
        prev.next = prev.next.next;
        return head;
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
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    LL list = new LL();
	    list.addLast(1);
	    list.addLast(2);
	    list.addLast(3);
	    list.addLast(4);
	    list.addLast(5);
	    
	    list.printLL();
	    
	    list.head = list.removeNthFromEnd(list.head,n);
	    list.printLL();
	}
}

// Time complexity - O(n)
// Space complexity - O(1)
