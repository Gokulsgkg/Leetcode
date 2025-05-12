import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        boolean[] visit = new boolean[1000]; 
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(digits); 
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {
                    if (i == j || j == k || i == k) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if (digits[i] == 0) continue;
                    if (num % 2 != 0) continue;
                    if (visit[num]) continue;

                    visit[num] = true;
                    ans.add(num);
                }
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
