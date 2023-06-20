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
    
    static class BinaryTree{
        static int idx = -1; // -1 so that we can increment it and can take it to our length
        
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        
        return Math.max(leftheight , rightheight) + 1;
    }
    
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;
        
        return Math.max(dia3, Math.max(dia1, dia2));
    }
    
    public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, 8, -1, -1};
		BinaryTree tree = new BinaryTree();
		
		Node root = tree.buildTree(nodes);
		System.out.println(diameter(root));
	}
}

// Time Complexity -> O(n^2) 
