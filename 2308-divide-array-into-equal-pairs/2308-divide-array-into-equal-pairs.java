class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i % 2 == 0){
                sum += nums[i];
            }else{
                sum -= nums[i];
            }
        }
        return sum != 0 ? false:true;
    }
}