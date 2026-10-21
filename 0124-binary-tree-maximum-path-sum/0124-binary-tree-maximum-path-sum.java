class Solution {
    int max_sum = Integer.MIN_VALUE;

    public int find(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int l = find(root.left);
        int r = find(root.right);

        l = Math.max(0, l);
        r = Math.max(0, r);

        max_sum = Math.max(max_sum, root.val + l + r);

        return root.val + Math.max(l, r);
    }

    public int maxPathSum(TreeNode root) {
        max_sum = Integer.MIN_VALUE;
        find(root);
        return max_sum;
    }
}