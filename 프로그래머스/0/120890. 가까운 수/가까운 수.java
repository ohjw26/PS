import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];
        int min = Math.abs(answer - n); 
        
        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(array[i] - n); 
            if (diff < min) {
                answer = array[i];
                min = diff;
            }
        }
        
        return answer;
    }
}