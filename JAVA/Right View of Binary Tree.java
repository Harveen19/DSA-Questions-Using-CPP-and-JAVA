// Right View of Binary Tree
// Easy  Accuracy: 65.18%  Submissions: 141K+  Points: 2

// Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

// Right view of following tree is 1 3 7 8.

//           1
//        /     \
//      2        3
//    /   \      /    \
//   4     5   6    7
//     \
//      8

// Example 1:

// Input:
//        1
//     /    \
//    3      2
// Output: 1 2
// Example 2:

// Input:
//      10
//     /   \
//   20     30
//  /   \
// 40  60 
// Output: 10 30 60
// Your Task:
// Just complete the function rightView() that takes node as parameter and returns the right view as a list. 

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(Height of the Tree).

// Constraints:
// 1 ≤ Number of nodes ≤ 10^5
// 0 ≤ Data of a node ≤ 10^5


class Solution{
    //Function to return list containing elements of right view of binary tree.
    static ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> result = new ArrayList<>();
        if(node == null){
            return result;
        }
        
        rightViewUtil(node, 1, result);
        return result;
    }
    
    static void rightViewUtil(Node node, int current, ArrayList<Integer> result){
        if(node == null){
            return;
        }
        
        int N = result.size();
        if(N < current){
            result.add(node.data);
        }
        
        rightViewUtil(node.right, current+1, result);
        rightViewUtil(node.left, current+1, result);
    }
}
