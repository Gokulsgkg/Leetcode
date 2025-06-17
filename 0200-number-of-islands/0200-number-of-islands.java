class Solution {
    private static boolean isValid(int n , int m , int newRow , int newCol){
        return newRow >= 0 && newRow < n && newCol >= 0 && newCol < m;
    }
    private static void bfs(int i , int j , char[][] grid , boolean[][] vis){
        vis[i][j] = true;
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i,j});
        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()){
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            int[] delrow = {-1, 0, 1, 0};
            int[] delcol = {0, 1, 0, -1};

            for(int k = 0 ; k < 4 ; k++){
                int newrow = row + delrow[k];
                int newcol = col + delcol[k];
                if(isValid(n, m, newrow , newcol) && grid[newrow][newcol] == '1' && !vis[newrow][newcol]){
                    vis[newrow][newcol] = true;
                    q.add(new int[]{newrow,newcol});
                }

            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    count++;
                    bfs(i , j , grid , vis);
                }
            }
        }
        return count;
    }
}