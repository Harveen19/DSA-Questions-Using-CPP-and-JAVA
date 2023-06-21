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
    static class TreeInfo{
        int diam;
        int ht;
        
        TreeInfo(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    
    public static TreeInfo diameter(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }
        
        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);
        
        int height = Math.max(left.ht, right.ht) + 1;
        
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        
        int diam = Math.max(Math.max(diam1, diam2), diam3);
        
        return new TreeInfo(diam, height);
    
    }
    
    public static void main(String[] args) {
	Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
		
	System.out.println(diameter(root).diam);
    }
}

// Time Complexity -> O(n) 
