class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        //이진수 -> 십진수
        int num1 = Integer.parseInt(bin1, 2); 
        int num2 = Integer.parseInt(bin2, 2);
        
        //십진수 -> 이진수
        answer = Integer.toBinaryString(num1 + num2);
        
        return answer;
    }
}