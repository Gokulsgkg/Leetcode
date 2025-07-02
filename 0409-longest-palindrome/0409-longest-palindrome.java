class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int ans = 0;
        boolean hasOdd = false;
        for (int n : freq) {
            ans += (n / 2) * 2;
            if (n % 2 == 1)
                hasOdd = true;
        }
        if (hasOdd)
            ans += 1;
        return ans;
    }
}