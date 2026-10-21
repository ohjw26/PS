import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int key : array) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        int maxCount = 0;
        int answer = -1; 
        boolean duplicate = false;
        
        for (int key : map.keySet()) {
            int count = map.get(key); //HashMap의 value값
            
            if (count > maxCount) {
                maxCount = count;
                answer = key;
                duplicate = false;
            } else if (count == maxCount) {
                duplicate = true;
            }
        }
        
        return duplicate ? -1 : answer;
    }
}