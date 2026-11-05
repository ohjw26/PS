class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int n = numLog[0];
        
        for (int i = 1; i < numLog.length; i++) {
            if (n - numLog[i] == -1) {
                answer += "w";
            } else if (n - numLog[i] == 1) {
                answer += "s";
            } else if (n - numLog[i] == -10) {
                answer += "d";
            } else if (n - numLog[i] == 10) {
                answer += "a";
            }
            n = numLog[i];
        }
        
        return answer;
    }
}