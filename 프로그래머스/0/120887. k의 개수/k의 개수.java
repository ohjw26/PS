class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int l = i; l <= j; l++) {
            String str = String.valueOf(l);
            
            for (int m = 0; m < str.length(); m++) {
                if(str.charAt(m) - '0' == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}