class Solution {
    
    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int maxCount = 0, current = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                current++;
            }
        }
        maxCount = current;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                current++;
            }
            if (isVowel(s.charAt(i - k))) {
                current--;
            }
            maxCount = Math.max(maxCount, current);
            if (maxCount == k) return k;
        }

        return maxCount;
    }
}
