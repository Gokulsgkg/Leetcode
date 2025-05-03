class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : gifts)q.add(n);

        for(int i = 0 ; i < k && q.peek() > 0 ; i++){
            int x = q.poll();
            q.add((int)Math.sqrt(x));
        }
        long ans = 0 ;
        for(int n : q)ans += n;
        return ans;
    }
}