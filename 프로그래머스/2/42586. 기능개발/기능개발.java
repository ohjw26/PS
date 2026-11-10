import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(day);
        }
        
        while(!queue.isEmpty()) {
            int day = queue.poll();
            int count = 1;
            while (!queue.isEmpty() && queue.peek() <= day) {
                queue.poll();
                count++;
            }
            
            list.add(count);
        }
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}