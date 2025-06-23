class Solution {
    private static int canDivisor(int mid, int[] nums){
        int ans = 0;
        for(int num : nums){
            ans += (num + mid-1) / mid;
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(max < num)max = num;
        }
        int high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canDivisor(mid, nums) <= threshold){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}