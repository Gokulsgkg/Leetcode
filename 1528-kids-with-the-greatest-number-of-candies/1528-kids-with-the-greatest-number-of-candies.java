class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] ans = new Boolean[candies.length];
        int max = 0 ;
        for(int num : candies){
            if(max < num ) max = num;
        }
        for(int i = 0 ; i < candies.length ; i++){
            ans[i] = (max <= candies[i] + extraCandies);
        }
        return Arrays.asList(ans);
    }
}