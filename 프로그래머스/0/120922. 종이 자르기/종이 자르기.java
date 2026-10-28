class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        //한변 길이 -1
        //한변 길이 * 다른 변의 길이 -1
        //위 둘을 더한 값
        answer = (M - 1) + ((N - 1) * M);
        return answer;
    }
}