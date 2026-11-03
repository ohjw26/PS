class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = 0;
        int first = 0;
        
        if (num % 2 == 0) {
            mid = total / num;
            first = mid - (num / 2 - 1);
        } else {
            mid = total / num;
            first = mid - num / 2;
        }
        
        
        for (int i = 0; i < num; i++) {
            answer[i] = first + i;
        }
        
        return answer;
    }
}