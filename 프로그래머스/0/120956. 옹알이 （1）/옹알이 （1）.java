class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            String str = babbling[i];
            
            str = str.replace("aya", "1");
            str = str.replace("ye", "1");
            str = str.replace("woo", "1");
            str = str.replace("ma", "1");
            
            str = str.replace("1", "");
            
            if(str.equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}