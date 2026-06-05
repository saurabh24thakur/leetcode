class Solution {

    public void bfs(int i, boolean[] vis, List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();

        q.add(i);
        vis[i] = true;

        while (!q.isEmpty()) {
            int front = q.remove();

            for (int a : rooms.get(front)) {
                if (!vis[a]) {
                    vis[a] = true;
                    q.add(a);
                }
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];

        bfs(0, vis, rooms);

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                return false;
            }
        }

        return true;
    }
}