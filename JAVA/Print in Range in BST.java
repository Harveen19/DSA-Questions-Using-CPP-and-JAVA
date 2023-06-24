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
    
    public static void printInRange(Node root, int x, int y){
        if(root == null){
            return;
        }
        
        if(root.data >= x && root.data <= y){
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        }
        else if(root.data >= y){
            printInRange(root.left ,x, y);
        }
        else{
            printInRange(root.right, x, y);
        }
    }
    
	public static void main(String[] args) {
		int values[] = {5, 1, 3, 4, 2, 7};
		Node root = null;
		
		for(int i=0; i<values.length; i++){
		    root = insert(root, values[i]);
		}
		
		inOrder(root);
		System.out.println();
		
		printInRange(root, 3, 5);
	}
}
