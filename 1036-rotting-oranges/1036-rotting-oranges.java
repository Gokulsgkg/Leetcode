class Solution {
    private static final int[] delrow = {-1, 0, 1, 0};
    private static final int[] delcol = {0, 1, 0, -1};
    private static boolean isValid(int n ,int m, int i, int j){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int time = 0;
        int count = 0;
        int total = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] != 0)total++;
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int k = q.size();
            count += k;
            while(k-- > 0){
                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];
                for(int i = 0 ; i < 4 ; i++){
                    int newRow = row + delrow[i];
                    int newCol = col + delcol[i];
                    if(isValid(n, m, newRow, newCol) && grid[newRow][newCol] == 1){
                        grid[newRow][newCol] = 2;
                        q.add(new int[]{newRow,newCol});
                    }
                }
            }
            if(!q.isEmpty())time++;
        }
        return total==count?time:-1;
    }
}