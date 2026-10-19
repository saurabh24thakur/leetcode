class Solution {
    private int idx = 0;

    public TreeNode solve(int[] preorder, int[] inorder, int s, int e){
        if(s > e) return null;
        int rootVal = preorder[idx];
        int t = s;
        for(int i = s; i <= e; i++){
            if(inorder[i] == rootVal){
                t = i;
                break;
            }
        }

        idx++;

        TreeNode root = new TreeNode(rootVal);
        root.left = solve(preorder, inorder, s, t - 1);
        root.right = solve(preorder, inorder, t + 1, e);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx = 0;
        int n = preorder.length;
        return solve(preorder, inorder, 0, n - 1);
    }
}