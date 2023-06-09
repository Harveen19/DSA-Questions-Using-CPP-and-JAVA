import java.util.*;

// Implementation from scratch
public class LL
{
    Node head;
    private int size;
    
    LL(){
        this.size = 0;
    }
    
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }
    
    // add last
    public void addLast(String data){
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
    
    // print
    public void printList(){
        if(head == null) {
           System.out.println("Empty List");
           return;
       }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        
        System.out.println("NULL");
    }
    
    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        
        size--;
        head = head.next;
    }
    
    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        
        size--;
        if(head.next == null){ // if there is a single node
            head = null;
            return;
        }
        
        Node secondLast = head;
        Node lastNode = head.next; 
        
        while(lastNode.next != null){ 
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        
        secondLast.next = null;
    }
    
    public int getSize(){
        return size;
    }
    
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		//list.printList();
		
		list.addLast("list");
		//list.printList();
		
		list.addFirst("this");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.getSize());
	}
}


// LinkedList class Implementation using Collection Framework

/* import java.util.*;

class Main{
    public static void main(String args[]){
        LinkedList<Integer> list= new LinkedList<Integer>();
        
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);
        System.out.println(list);
        
        System.out.println(list.size());
        
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }
        
        System.out.println("null");
        
        list.removeFirst();
        System.out.println(list);
        
        list.removeLast();
        System.out.println(list);
        
        list.remove(1);
        System.out.println(list);
    }
} */
