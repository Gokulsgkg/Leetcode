class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int n : arr){
            if(n % 2 == 1){
                count++;
                if(count == 3)return true;
            }
            else count = 0;
        }
        return false;
    }
}