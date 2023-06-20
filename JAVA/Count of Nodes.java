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
    
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        int totalNodes = leftNodes + rightNodes + 1;
        
        return totalNodes;
    }
    
    public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
		BinaryTree tree = new BinaryTree();
		
		Node root = tree.buildTree(nodes);
		System.out.println(countOfNodes(root));
	}
}

// Time Complexity -> O(n) because its reaching to the node just once
