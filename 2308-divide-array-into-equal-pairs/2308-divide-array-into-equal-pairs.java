class Solution {
   public boolean divideArray(int[] nums) {
        int[] bitmap = new int[501];
        for(int i : nums) bitmap[i]++;
        for (int i : bitmap) if(i % 2 != 0) return false;
        return true;
    }
}