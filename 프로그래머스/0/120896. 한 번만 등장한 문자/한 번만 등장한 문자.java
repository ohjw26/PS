import java.util.*;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char key : s.toCharArray()) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        String answer = "";
        
        for (char key : map.keySet()) {
            if(map.get(key) == 1) {
                answer += key;
            }
        }
        
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
}