import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i : stones) pq.add(i);
        while (pq.size() > 1) {
            int sub = pq.poll() - pq.poll();
            if (sub != 0) {
                pq.add(sub);
            } //if
        } //while
        return pq.size() > 0 ? pq.poll() : 0;
    } //lastStoneWeight
} //Solution