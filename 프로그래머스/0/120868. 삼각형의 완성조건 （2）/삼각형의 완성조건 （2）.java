class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        for (int i = 1; i < sides[0] + sides[1]; i++) {
            if ((max - min < i && i <= max)
               || (max < i && i < sides[0] + sides[1])) {
                answer++;
            }
        }
        
        return answer;
    }
}