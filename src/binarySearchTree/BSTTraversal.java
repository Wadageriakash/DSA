package binarySearchTree;

import java.util.Iterator;
import java.util.Stack;

public class BSTTraversal {

    // Function to reconstruct the BST from its Preorder traversal
    public static TreeNode constructBST(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);

        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            // If the current node value is less than the stack's top, it's a left child
            if (node.val < stack.peek().val) {
                stack.peek().left = node;
            } else {
                // Otherwise, it's a right child. Pop nodes from stack until we find a node
                // whose value is greater than the current node's value.
                TreeNode temp = null;
                while (!stack.isEmpty() && node.val > stack.peek().val) {
                    temp = stack.pop();
                }
                // The last popped node is the parent for the current node
                if (temp != null) {
                    temp.right = node;
                }
            }
            stack.push(node);
        }
        return root;
    }
}