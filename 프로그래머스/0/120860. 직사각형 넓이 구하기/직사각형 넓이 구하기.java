class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        for (int i = 0; i < dots.length; i++) {
            width = Math.max(width, Math.abs(dots[i][0] - dots[0][0]));
            height = Math.max(height, Math.abs(dots[i][1] - dots[0][1]));
        }
        
        answer = width * height;
        return answer;
    }
}