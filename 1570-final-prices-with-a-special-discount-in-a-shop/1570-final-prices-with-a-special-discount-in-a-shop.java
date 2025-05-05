public class Solution {
    static int getDisc(int[] prices , int i , int n){
        for(int j = i+1 ; j < n ; j++){
            if(prices[i] >= prices[j])return prices[i]-prices[j];
        }
        return prices[i];
    }
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        for(int i = 0 ; i < n ; i++){
            prices[i] =  getDisc(prices,i,n);
        }
        return prices;
    }
}
