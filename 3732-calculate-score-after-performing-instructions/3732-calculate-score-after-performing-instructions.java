class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = values.length;
        boolean[] vis = new boolean[n];
        int i = 0;
        long ans = 0;
        while(i >= 0 &&  i < n && !vis[i]){
            vis[i] = true;
            if(instructions[i].equals("jump")){
                i += values[i];
            }
            else{
                ans += values[i];
                i++;
            }
        }
        return ans;
    }
}