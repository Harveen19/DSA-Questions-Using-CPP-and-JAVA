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
    
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    public Node findMiddle(Node head){
        Node fast = head;
        Node slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
    }
    
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        
        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);
        Node firstHalfStart = head;
        
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        
        return true;
    }
    
	public static void main(String[] args) {
		LL list = new LL();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(2);
		list.addLast(1);
		
		System.out.println(list.isPalindrome());
	}
}

// Time complexity - O(n)
// Space complexity - O(1)  
