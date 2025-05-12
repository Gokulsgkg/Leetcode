import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int num = 100; num < 1000; num += 2) {
            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            int[] tempFreq = new int[10];
            tempFreq[a]++;
            tempFreq[b]++;
            tempFreq[c]++;

            boolean valid = true;
            for (int i = 0; i < 10; i++) {
                if (tempFreq[i] > freq[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) result.add(num);
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
