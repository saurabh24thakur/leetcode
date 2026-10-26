
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.left, val);
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
                return root;
            }
            insertIntoBST(root.right, val);
        }

        return root;
    }
}
