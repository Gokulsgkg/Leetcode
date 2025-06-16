class Solution {
    private static void dfs(int node , List<Integer> adjList[] , boolean[] vis){
        vis[node] = true;
        for(int it : adjList[node]){
            if(!vis[it]){
                dfs(it , adjList , vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
 
        List<Integer>[] adjList = new ArrayList[V];
        for(int i = 0 ; i < V ; i++){
            adjList[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < V ; i++){
            for(int j = 0 ; j < V ; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adjList[i].add(j);
                    adjList[j].add(i);
                }
            }
        }

        boolean[] vis = new boolean[V];
        int count = 0;
        for(int i = 0 ; i < V ; i++){
            if(!vis[i]){
                count++;
                dfs(i , adjList , vis);
            }
        }
        return count;
    }
}