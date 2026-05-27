class Solution {
    public int height(TreeNode root){
        if(root==null) return 0;
        int left_height=height(root.left);
        int right_height=height(root.right);

        return Math.max(left_height, right_height) + 1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }

        int left_dim=diameterOfBinaryTree(root.left);
        int right_dim=diameterOfBinaryTree(root.right);
        int curr=height(root.left)+height(root.right);

        return Math.max(left_dim,Math.max(right_dim,curr));
    }
}