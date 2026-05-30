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
    public int find(int[] in, int ele) {
        for (int i = 0; i < in.length; i++) {
            if (in[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode();
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        root.val = preorder[0];
        int idx = find(inorder, root.val);
        root.left = buildTree(
                Arrays.copyOfRange(preorder, 1, idx + 1),
                Arrays.copyOfRange(inorder, 0, idx));

        root.right = buildTree(
                Arrays.copyOfRange(preorder, idx + 1, preorder.length),
                Arrays.copyOfRange(inorder, idx + 1, inorder.length));

        return root;
    }
}