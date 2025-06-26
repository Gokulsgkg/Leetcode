class Solution {
    private static boolean dfs(int i, ArrayList<Integer>[] adj, int[] vis, Stack<Integer> st){
        vis[i] = 1;
        for(int it : adj[i]){
            if(vis[it] == 1)return false;
            if(vis[it] == 0)dfs(it, adj, vis, st);
        }
        st.push(i);
        vis[i] = 2;
        return true;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = prerequisites.length;
        int[] vis = new int[numCourses];
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[numCourses];
        ArrayList<Integer>[] adj = new ArrayList[numCourses];
        for(int i = 0 ; i < numCourses ; i++){
            adj[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < n ; i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj[v].add(u);
        }
        for(int i = 0 ; i < numCourses ; i++){
            if(vis[i] == 0){
                dfs(i, adj, vis, st);
            }
        }
        for(int i = 0 ; i < numCourses ; i++){
            if (st.isEmpty()) return new int[0];
            ans[i] = st.pop();
        }
        return ans;
    }
}