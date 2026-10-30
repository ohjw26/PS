class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        while (chicken >= 10) {
            answer += chicken / 10; //108, 10,  1
            chicken = chicken / 10 + chicken % 10; 
        }

        return answer;
    }
}