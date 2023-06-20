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
    
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        int totalSum = leftSum + rightSum + root.data;
        
        return totalSum;
    }
    
    public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
		BinaryTree tree = new BinaryTree();
		
		Node root = tree.buildTree(nodes);
		System.out.println(sumOfNodes(root));
	}
}

// Time Complexity -> O(n) because its reaching to the each node just once
