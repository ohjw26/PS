class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 0; i < number.length(); i++) {
            int num = number.charAt(i) - '0';
            sum += num;
        }
        
        answer = sum % 9;
        return answer;
    }
}