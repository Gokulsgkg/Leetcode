class Solution {
    private static final int[] delrow = {-1, 0, 1, 0};
    private static final int[] delcol = {0, 1, 0, -1};
    private static boolean isValid(int n, int m, int i, int j){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dist = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i, j});
                }else{
                    dist[i][j] = -1;
                }
            }
        }
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];
            for(int i = 0 ; i < 4 ; i++){
                int newRow = row + delrow[i];
                int newCol = col + delcol[i];
                if(isValid(n, m, newRow, newCol) && dist[newRow][newCol] == -1){
                    dist[newRow][newCol] = dist[row][col]+1;
                    q.add(new int[]{newRow, newCol});
                }
            }
        }
        return dist;
    }
}