import java.util.*;

public class Main
{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
        }
    }
    
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }
        
        else{
            root.right = insert(root.right, val);
        }
        
        return root;
    }
    
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{ // root.data == val
            // Case 1
            if(root.left == null && root.right == null){
                return null;
            }
            
            // Case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            
            // Case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        
        return root;
    }
    
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        
        return root;
    }
    
	public static void main(String[] args) {
		int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
		Node root = null;
		
		for(int i=0; i<values.length; i++){
		    root = insert(root, values[i]);
		}
		
		inOrder(root);
		System.out.println();
		
		delete(root, 5);
		inOrder(root);
	}
}