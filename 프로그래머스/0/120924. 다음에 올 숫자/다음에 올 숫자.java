class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        //배열이 등차수열인지 등비수열인지 확인
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1] + common[1] - common[0];
        } else if (common[1] / common[0] == common[2] / common[1]) {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }
}