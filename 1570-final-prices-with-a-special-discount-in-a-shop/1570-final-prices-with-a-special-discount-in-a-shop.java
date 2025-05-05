public class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n = prices.length;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && prices[i] <= prices[st.peek()]) {
                int idx = st.pop();
                prices[idx] -= prices[i];
            }
            st.push(i);
        }

        return prices;
    }
}
