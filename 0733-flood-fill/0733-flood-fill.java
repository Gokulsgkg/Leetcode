class Solution {
    private static int[] delRow = {-1, 0, 1, 0};
    private static int[] delCol = {0, 1, 0, -1};
    private static boolean isValid(int n , int m, int i , int j){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    private static void dfs(int[][] image , int[][] ans , int sr , int sc , int initial , int color){
        ans[sr][sc] = color;
        int n = image.length;
        int m = image[0].length;
        for(int i = 0 ; i < 4 ; i++){
            int newRow = sr + delRow[i];
            int newCol = sc + delCol[i];
            if(isValid(n, m, newRow, newCol) && image[newRow][newCol] == initial && ans[newRow][newCol] != color){
                dfs(image, ans, newRow, newCol, initial , color);
            }
        }

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial = image[sr][sc];
        int[][] ans = new int[image.length][image[0].length];
        for(int i = 0 ; i < image.length ; i++){
            ans[i] = Arrays.copyOf(image[i],image[0].length);
        }
        dfs(image, ans, sr, sc, initial, color);
        return ans;
    }
}