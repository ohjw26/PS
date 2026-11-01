class Solution {
    public int solution(int n) {
        int num = 0;
        
        for (int i = 1; i <= n; i++) {
            num++;
            while ((String.valueOf(num)).contains("3") || num % 3 == 0) {
                num++;
            }
        }
        
        return num;
    }
}