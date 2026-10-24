class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() + n - 1) / n];
        int index = 0;
        
        for (int i = 0; i < my_str.length(); i += n) {
            answer[index++] = my_str.substring(i, Math.min(i + n, my_str.length()));
        }
        
        return answer;
    }
}