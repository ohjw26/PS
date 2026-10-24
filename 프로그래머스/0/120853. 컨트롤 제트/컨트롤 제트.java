import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (String str : s.split(" ") ) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str)); //[1, 3]
            }
        }
        
        for (int i : stack){
            answer += i;
        }
        
        return answer;
    }
}