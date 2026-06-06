class Solution {
       public static int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length,n=grid[0].length;
        boolean[][] vis=new boolean[m][n];        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
    bfs(grid,vis,count,i,j);
    count++;
}
            }
        }
        
        return count;

    }

   public static void bfs(char[][] grid, boolean[][] vis, int count, int i, int j) {
    int m = grid.length, n = grid[0].length;

    vis[i][j] = true;

    // right
    if (j + 1 < n && grid[i][j + 1] == '1' && !vis[i][j + 1]) {
        bfs(grid, vis, count, i, j + 1);
    }

    // left
    if (j - 1 >= 0 && grid[i][j - 1] == '1' && !vis[i][j - 1]) {
        bfs(grid, vis, count, i, j - 1);
    }

    // up
    if (i - 1 >= 0 && grid[i - 1][j] == '1' && !vis[i - 1][j]) {
        bfs(grid, vis, count, i - 1, j);
    }

    // down
    if (i + 1 < m && grid[i + 1][j] == '1' && !vis[i + 1][j]) {
        bfs(grid, vis, count, i + 1, j);
    }
}
   
}