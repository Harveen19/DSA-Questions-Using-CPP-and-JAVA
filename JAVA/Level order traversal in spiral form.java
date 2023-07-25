// Level order traversal in spiral form
// Easy  Accuracy: 36.43%  Submissions: 185K+  Points: 2

// Given a binary tree and the task is to find the spiral order traversal of the tree.

// Spiral order Traversal mean: Starting from level 0 for root node, for all the even levels we print the node's value from right to left and for all the odd levels we print the node's value from left to right. 

// For below tree, function should return 1, 2, 3, 4, 5, 6, 7.


 
 

// Example 1:

// Input:
//       1
//     /   \
//    3     2
// Output:1 3 2

// Example 2:

// Input:
//            10
//          /     \
//         20     30
//       /    \
//     40     60
// Output: 10 20 30 60 40 
// Your Task:
// The task is to complete the function findSpiral() which takes root node as input parameter and returns the elements in spiral form of level order traversal as a list. The newline is automatically appended by the driver code.
// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(N).

// Constraints:
// 1 <= Number of nodes <= 10^5
// 0 <= Data of a node <= 10^5


/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return null;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean count = true;
        
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int n = q.size();
            for(int i=0;i<n;i++){
                Node t = q.remove();
                temp.add(t.data);
                
                if(t.left != null){
                    q.add(t.left);
                }
                
                if(t.right != null){
                    q.add(t.right);
                }
            }
            
            if(count){
                Collections.reverse(temp);
            }
                
            for(int i:temp){
                result.add(i);
            }
                
            count = !count;
        }
        
        return result;
    }
}
