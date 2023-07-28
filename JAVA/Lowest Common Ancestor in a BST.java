import java.util.*;
import java.io.*;

public class Main{
    static class Node{
        int data;
        Node left, right;
        
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    
    static class BinaryTree{
        Node root;
        
        Node LCA(Node node, int n1, int n2){
            if(node == null){ // base case
                return null;
            }
            
            // If both n1 and n2 are smaller than root, then LCA lies in left
            if(node.data > n1 && node.data > n2){
                return LCA(node.left, n1, n2);
            }
            
            // If both n1 and n2 are greater than root, then LCA lies in right
            if(node.data < n1 && node.data < n2){
                return LCA(node.right, n1, n2);
            }
            
            return node;
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        Node t = tree.LCA(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
    }
}
