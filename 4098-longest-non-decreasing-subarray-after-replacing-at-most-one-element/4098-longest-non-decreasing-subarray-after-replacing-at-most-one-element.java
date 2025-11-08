class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n <= 2){
            return n;
        }
        int[] dp_forword = new int[n];
        dp_forword[0] = 1;
        int maxLen = 1;

        for(int i = 1 ; i < n ; i++){
            if(nums[i] >= nums[i-1]){
                dp_forword[i] = dp_forword[i-1] +1;
            }else{
                dp_forword[i] = 1;
            }
            maxLen = Math.max(maxLen , dp_forword[i]);
        }
        if(maxLen == n){
            return n;
        }

        int[] dp_backword = new int[n];
        dp_backword[n-1] = 1;

        for(int i = n - 2 ; i >= 0 ; i--){
            if(nums[i] <= nums[i+1]){
                dp_backword[i] = dp_backword[i+1] +1;
            }else{
                dp_backword[i] = 1;
            }
        }
        for(int k = 0 ; k < n ; k++){
            int L1 = (k > 0)? dp_forword[k-1]:0;
            int L2 = (k < n -1)?dp_backword[k+1]:0;

            if(k > 0 && k < n-1){
                if(nums[k-1] <= nums[k+1]){
                    maxLen = Math.max(maxLen , L1 + L2 + 1);
                }
            }
            maxLen = Math.max(maxLen , Math.max(L1,L2) + 1);
        }
        return maxLen;
    }
}