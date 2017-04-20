package algorithm.easy;

import algorithm.base.TreeNode;

/**
 * Created by Kyle on 21/04/2017.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) return true;
        if (leftNode == null || rightNode == null) return false;

        if (leftNode.val != rightNode.val) return false;

        return isSymmetric(leftNode.left, rightNode.right)
                && isSymmetric(leftNode.right, rightNode.left);
    }
}
