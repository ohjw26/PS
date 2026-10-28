class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int max = Math.max(M, N);
        int min = Math.min(M, N);
        
        //더 작은 변을 길이 1이 될만큼 자름 -> 작은변 길이 -1
        //긴 변의 길이 -1 * 작은변 길이 
        //위 둘을 더한 값
        answer = (min - 1) + ((max - 1) * min);
        return answer;
    }
}