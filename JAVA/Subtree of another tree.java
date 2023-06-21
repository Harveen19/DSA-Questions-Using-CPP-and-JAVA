import java.util.*;

public class Main
{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static boolean isIdentical(Node root, Node subRoot){
        if(root ==  null && subRoot == null){
            return true;
        }
        
        if(root == null || subRoot == null){
            return false;
        }
        
        if(root.data == subRoot.data){
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        
        return false;
    }
    
    public static boolean isSubtree(Node root, Node subRoot){
        if(subRoot == null){ // base case 1
            return true;
        }
        
        if(root == null){ // base case 2
            return false;
        }
        
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    public static void main(String[] args) {
	Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
		
	Node subRoot = new Node(3);
	subRoot.left = new Node(6);
	subRoot.right = new Node(7);
		
	System.out.println(isSubtree(root, subRoot));
    }
} 
