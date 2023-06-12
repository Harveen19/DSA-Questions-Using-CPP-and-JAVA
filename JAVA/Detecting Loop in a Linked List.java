import java.util.*;

public class LL
{
    static Node head;
    
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static boolean detectLoop(){
        if(head == null){
            return false;
        }
        
        Node fast = head;
        Node slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
    
	public static void main(String[] args) {
		LL list = new LL();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = third;
		
		System.out.println(detectLoop());
	}
}

// Time complexity - O(n)
// Space complexity - O(1)  
