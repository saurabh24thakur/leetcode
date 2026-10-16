class Solution {
    public void find(TreeNode root, int l, int r, int pos){
        if(root == null) return;

        l = Math.min(l, pos);
        r = Math.max(r, pos);

        find(root.left, l, r, pos - 1);
        find(root.right, l, r, pos + 1);
    }

    public void trav(TreeNode root, List<List<int[]>> p, List<List<int[]>> n, int pos){
        if(root == null) return;

        // Queue for BFS storing: [TreeNode, int pos, int row]
        Queue<Object[]> queue = new LinkedList<>();
        queue.offer(new Object[]{root, pos, 0});

        while(!queue.isEmpty()){
            Object[] curr = queue.poll();
            TreeNode currNode = (TreeNode) curr[0];
            int currPos = (int) curr[1];
            int row = (int) curr[2];

            if(currPos >= 0){
                while(p.size() <= currPos) p.add(new ArrayList<>());
                p.get(currPos).add(new int[]{row, currNode.val});
            } else {
                int idx = -1 * currPos;
                while(n.size() <= idx) n.add(new ArrayList<>());
                n.get(idx).add(new int[]{row, currNode.val});
            }

            if(currNode.left != null){
                queue.offer(new Object[]{currNode.left, currPos - 1, row + 1});
            }
            if(currNode.right != null){
                queue.offer(new Object[]{currNode.right, currPos + 1, row + 1});
            }
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        int l = 0, r = 0;
        find(root, l, r, 0);

        List<List<int[]>> p = new ArrayList<>();
        List<List<int[]>> n = new ArrayList<>();

        p.add(new ArrayList<>()); 
        n.add(new ArrayList<>());

        trav(root, p, n, 0);

        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = n.size() - 1; i >= 1; i--) {
            List<int[]> col = n.get(i);
            // Sort by row first, then by value
            Collections.sort(col, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
            
            List<Integer> sortedCol = new ArrayList<>();
            for (int[] pair : col) sortedCol.add(pair[1]);
            result.add(sortedCol);
        }
        
        for (int i = 0; i < p.size(); i++) {
            List<int[]> col = p.get(i);
            // Sort by row first, then by value
            Collections.sort(col, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
            
            List<Integer> sortedCol = new ArrayList<>();
            for (int[] pair : col) sortedCol.add(pair[1]);
            result.add(sortedCol);
        }

        return result;
    }
}