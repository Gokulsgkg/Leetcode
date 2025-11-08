class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == target ? 1 : -1);
        }
        long[] sorted = Arrays.copyOf(prefix, prefix.length);
        Arrays.sort(sorted);
        Map<Long, Integer> rank = new HashMap<>();
        int idx = 1;
        for (long val : sorted) {
            if (!rank.containsKey(val)) rank.put(val, idx++);
        }
        FenwickTree bit = new FenwickTree(rank.size());
        long ans = 0;
        for (long val : prefix) {
            int r = rank.get(val);
            ans += bit.query(r - 1);
            bit.update(r, 1);
        }
        return ans;
    }
    static class FenwickTree {
        long[] tree;
        int n;
        FenwickTree(int n) {
            this.n = n;
            tree = new long[n + 1];
        }
        void update(int i, long delta) {
            while (i <= n) {
                tree[i] += delta;
                i += i & -i;
            }
        }
        long query(int i) {
            long sum = 0;
            while (i > 0) {
                sum += tree[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}