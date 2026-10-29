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
    public void t(TreeNode root,PriorityQueue<Integer> max,int k){
        if(root==null){
            return;
        }
        if(root.left!=null){
            max.add(root.left.val);
        }

        if(root.right!=null){
            max.add(root.right.val);
        }

        while(max.size()>k){
            max.poll();
        }


        t(root.left,max,k);
        t(root.right,max,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> max= new PriorityQueue<>(Collections.reverseOrder());
        max.add(root.val);
        t(root,max,k);

        return max.peek();
    }
}