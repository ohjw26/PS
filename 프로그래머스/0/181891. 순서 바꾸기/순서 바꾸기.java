import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] a = Arrays.copyOfRange(num_list,n, num_list.length);
        int[] b = Arrays.copyOfRange(num_list, 0, n);
        
        int[] answer = new int[a.length + b.length];
        
        int index = 0;
        
        for (int i = 0; i < a.length; i++) {
            answer[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            answer[index++] = b[i];
        }
        
        return answer;
    }
}