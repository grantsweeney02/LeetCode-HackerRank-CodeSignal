/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode returnNode = root;
        while(root != null) {
            Integer rootVal = root.val;
            if(p.val > rootVal && q.val > rootVal) {
                root = root.right;
            }
            else if(p.val < rootVal && q.val < rootVal) {
                root = root.left;
            }
            else {
                return root;
            }
        }
        return root;
    }
}