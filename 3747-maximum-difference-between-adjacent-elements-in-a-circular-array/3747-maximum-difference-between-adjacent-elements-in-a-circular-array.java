class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            ans = Math.max(ans,Math.abs(nums[i]-nums[(i+1) % nums.length]));
        }
        return ans;
    }
}