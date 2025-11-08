class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int total = 0;
        for(int i = 0 ; i < n ;i++){
            int targetCnt = 0;
            for(int j = i ; j < n ; j++){
                if(nums[j] == target){
                    targetCnt++;
                }
                int length = j - i + 1;

                if(targetCnt*2 > length){
                    total++;
                }
            }
        }
        return total;
    }
}