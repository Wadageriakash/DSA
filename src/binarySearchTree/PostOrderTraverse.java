package binarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraverse {

	public static void main(String[] args) {
		// Given Preorder traverse
		int[] preorder = {30, 20, 10, 15, 25, 23, 39, 35, 42};
		
		// Reconstruct the BST
		TreeNode root = BSTTraversal.constructBST(preorder);
		
		// Perform Postorder traversal
		List<Integer> postorder = postorderTraversal(root);
		
		 // Print the Postorder traversal
        System.out.println("Preorder Traversal: " + java.util.Arrays.toString(preorder));
        System.out.println("Postorder Traversal: " + postorder);
        
//        Preorder Traversal: [30, 20, 10, 15, 25, 23, 39, 35, 42]
//        Postorder Traversal: [15, 10, 23, 25, 20, 35, 42, 39, 30]

	}

	    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            TreeNode current = s1.pop();
            s2.push(current);

            if (current.left != null) {
                s1.push(current.left);
            }
            if (current.right != null) {
                s1.push(current.right);
            }
        }

        while (!s2.isEmpty()) {
            result.add(s2.pop().val);
        }
        return result;
    }
}
