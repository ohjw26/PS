import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Arrays.fill(answer, 1);
        int[] sum = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        for (int i = 0; i < sum.length; i++) {
            for (int j = i + 1; j < sum.length; j++) {
                if (sum[i] < sum[j]) {
                    answer[i]++;
                } else if (sum[i] > sum[j]) {
                    answer[j]++;
                }
            }
        }
        
        return answer;
    }
}