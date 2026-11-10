import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new ArrayDeque<>();
        int currentWeight = 0;
        int idx = 0;
        int answer = 0;
        
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }
        
        while (idx < truck_weights.length || currentWeight > 0) {
            answer++;
            
            currentWeight -= queue.poll();
            if (idx < truck_weights.length && currentWeight + truck_weights[idx] <= weight) {
                queue.offer(truck_weights[idx]);
                currentWeight += truck_weights[idx];
                idx++;
            } else {
                queue.offer(0);
            }
        }
        
        return answer;
    }
}