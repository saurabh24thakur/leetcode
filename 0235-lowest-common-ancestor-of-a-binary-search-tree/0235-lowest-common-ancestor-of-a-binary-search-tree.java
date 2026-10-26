
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
    public boolean isContain(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        if (root == p || root == q) return true;

        return isContain(root.left, p, q) || isContain(root.right, p, q);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;
        if (p == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        if (isContain(root.left, p, q) && isContain(root.right, p, q)) {
            return root;
        }

        return left != null ? left : right;
    }
}
