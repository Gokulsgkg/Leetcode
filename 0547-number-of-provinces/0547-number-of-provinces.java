class Solution {
    private static void dfs(int node , int[][] isConnected , boolean[] vis){
        vis[node] = true;
        for(int i = 0 ; i < isConnected.length ; i++){
            if(isConnected[node][i] == 1 && !vis[i]){
                dfs(i, isConnected , vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;

        boolean[] vis = new boolean[V];
        int count = 0;
        for(int i = 0 ; i < V ; i++){
            if(!vis[i]){
                count++;
                dfs(i , isConnected , vis);
            }
        }
        return count;
    }
}