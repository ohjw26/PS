import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));
        
        if (str[0].equals("0")) {
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        for (String strs : str) {
            answer.append(strs);
        }

        return answer.toString();
    }
}