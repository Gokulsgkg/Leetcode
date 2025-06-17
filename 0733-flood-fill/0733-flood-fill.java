class Solution {
    private static boolean isValid(int n , int m, int i , int j){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    private static void dfs(int[][] image , int initial , int sr , int sc , int color){
        if(!isValid(image.length , image[0].length , sr , sc) || image[sr][sc] != initial || color == initial)return;
        image[sr][sc] = color;
        dfs(image, initial, sr+1 , sc , color);
        dfs(image, initial, sr-1 , sc , color);
        dfs(image, initial, sr , sc+1 , color);
        dfs(image, initial, sr , sc-1 , color);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initial = image[sr][sc];
        dfs(image, initial, sr, sc, color);
        return image;
    }
}