class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : stones){
            heap.add(n);
        }
        while(heap.size() > 1){
            int top1 = heap.poll();
            int top2 = heap.poll();
            int diff = top1-top2;
            if(diff != 0){
                heap.add(diff);
            }
        }
        if(heap.size() != 0){
            return heap.poll();
        }
        return 0;
    }
}