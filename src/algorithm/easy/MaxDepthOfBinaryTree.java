package algorithm.easy;

import algorithm.base.TreeNode;

/**
 * Created by Kyle on 21/04/2017.
 */
public class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
