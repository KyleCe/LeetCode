package algorithm.easy;import algorithm.base.TreeNode;public class IsSubTree {    /**     * Definition for a binary tree node.     * public class TreeNode {     *     int val;     *     TreeNode left;     *     TreeNode right;     *     TreeNode(int x) { val = x; }     * }     */    class Solution {        public boolean isSubtree(TreeNode s, TreeNode t) {            if(s==null) return false;            if(s.val==t.val)                return sub(s.left, t.left)&&sub(s.right, t.right);            return isSubtree(s.left, t)|| isSubtree(s.right,t);        }        private boolean sub(TreeNode s,TreeNode t){            if(s==null && t==null) return false;            if(t==null||s==null)return false;            return  s.val==t.val&&sub(s.left,t.left)&&sub(s.right,t.right);        }    }}