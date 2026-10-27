class Solution {
    public void r(TreeNode root) {
        TreeNode temp = root.left;

        while (temp.right != null) {
            temp = temp.right;
        }

        temp.right = root.right;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val == key) {
            if (root.left == null) return root.right;
            r(root);
            return root.left;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }
}