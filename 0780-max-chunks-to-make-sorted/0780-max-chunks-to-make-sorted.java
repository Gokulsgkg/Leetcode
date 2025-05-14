class Solution {
    public int maxChunksToSorted(int[] arr) {
        int sum = 0 , exp = 0 , chunk = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            exp += i;
            if(sum == exp)chunk++;
        }
        return chunk;
    }
}