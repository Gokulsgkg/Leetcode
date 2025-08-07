class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(!vis[j] && fruits[i] <= baskets[j]){
                    count++;
                    vis[j] = true;
                    break;
                }
            }
        }
        return n-count;
    }
}