class Solution {
    
    static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int current = 0;

        // Initialize the first window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                current++;
            }
        }
        maxCount = current;

        // Sliding window approach
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                current++;
            }
            if (isVowel(s.charAt(i - k))) {
                current--;
            }
            maxCount = Math.max(maxCount, current);
        }

        return maxCount;
    }
}
