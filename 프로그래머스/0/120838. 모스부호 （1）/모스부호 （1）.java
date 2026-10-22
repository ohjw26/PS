class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        
        String[] letter2 = letter.split(" ");
        for (int i = 0; i < letter2.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (letter2[i].equals(morse[j])) {
                    answer += (char) ('a' + j);
                }
            }
        }
        
        return answer;
    }
}