class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] arr = new String[5];
        
        for (int i = 0; i < quiz.length; i++) {
            arr = quiz[i].split(" "); //["3", "-", "4", "=", "-3"]
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int ans = Integer.parseInt(arr[4]);
            
            if (arr[1].equals("+")) {
                if (num1 + num2 == ans) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (arr[1].equals("-")) {
                if (num1 - num2 == ans) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}