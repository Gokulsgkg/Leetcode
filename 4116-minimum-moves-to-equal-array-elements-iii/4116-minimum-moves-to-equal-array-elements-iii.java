class Solution {
    public int minMoves(int[] nums) {
        int maxi = nums[0];
        for(int x : nums){
            maxi = Math.max(maxi , x);
        }
        int move = 0;
        for(int x : nums){
            move += (maxi - x);
        }
        return move;
    }
}