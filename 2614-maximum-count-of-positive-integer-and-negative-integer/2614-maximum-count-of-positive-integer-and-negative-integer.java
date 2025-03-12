class Solution {
    public int maximumCount(int[] nums) {
        int pos = nums.length;
        int neg = 0;
        for(int num : nums){
            if(num < 0){
                neg++;
                pos--;
            } else if(num == 0){
                pos--;
            }
            else{
                break;
            }
        }
        return pos>neg?pos:neg;
    }
}