/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public  int height(TreeNode root){
        if(root==null) return 0;
        int left_height=height(root.left);
        int right_height=height(root.right);

        return Math.max(left_height, right_height) + 1;

    }

    public  boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);
        
       
        int heightDiff = Math.abs(height(root.left) - height(root.right));
        
        return isLeftBalanced && isRightBalanced && heightDiff <= 1;

    }


}