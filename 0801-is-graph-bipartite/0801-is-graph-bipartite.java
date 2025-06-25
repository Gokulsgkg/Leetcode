class Solution {
    private static boolean bfs(int start, int[] color,int[][] grid){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 1;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int it : grid[node]){
                if(color[it] == 0){
                    color[it] = color[node]==1?2:1;
                    q.add(it);
                }else if(color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(color[i] == 0){
                if(!bfs(i,color,graph)){
                    return false;
                }
            }
        }
        return true;
    }
}