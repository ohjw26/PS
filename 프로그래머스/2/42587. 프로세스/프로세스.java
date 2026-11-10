import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
        }
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            boolean hasHigher = false;
            
            for (int i : queue) {
                if (priorities[i] > priorities[current]) {
                    hasHigher = true;
                    break;
                }
            }
            
            if (hasHigher) {
                queue.offer(current);
            } else {
                answer++;
                
                if (current == location) {
                    return answer;
                }
            }
        }
        return answer;
    }
}