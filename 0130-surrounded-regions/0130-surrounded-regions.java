class Solution {
    private static final int[] delrow = {-1, 0, 1, 0};
    private static final int[] delcol = {0, 1, 0, -1};
    private static boolean isValid(int n, int m, int i, int j){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    private static void dfs(int row , int col , boolean[][] vis, char[][] board){
        vis[row][col] = true;
        for(int i = 0 ; i < 4 ; i++){
            int newRow = row + delrow[i];
            int newCol = col + delcol[i];
            if(isValid(vis.length,vis[0].length,newRow,newCol) && !vis[newRow][newCol] && board[newRow][newCol] == 'O'){
                dfs(newRow, newCol, vis, board);
            }
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int j = 0 ; j < m ; j++){
            if(!vis[0][j] && board[0][j] == 'O'){
                dfs(0, j, vis, board);
            }
            if(!vis[n-1][j] && board[n-1][j] == 'O'){
                dfs(n-1, j, vis, board);
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(!vis[i][0] && board[i][0] == 'O'){
                dfs(i, 0, vis, board);
            }
            if(!vis[i][m-1] && board[i][m-1] == 'O'){
                dfs(i, m-1, vis, board);
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(!vis[i][j] && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
}