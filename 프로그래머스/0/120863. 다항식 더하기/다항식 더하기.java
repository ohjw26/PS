class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" \\+ "); //"3x", "7", "x"
        int sumX = 0;
        int sumNum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                String coefficient = arr[i].replace("x", "");
                int num = 0;
                if (coefficient.isEmpty()) {
                    num = 1;
                } else {
                    num = Integer.parseInt(coefficient);
                }
                sumX += num;
            } else {
                sumNum += Integer.parseInt(arr[i]);
            }
        }
        
        if (sumX > 0) {
            if (sumX == 1) {
                answer += "x";
            } else {
                answer += String.valueOf(sumX) + "x";
            }
        }
        
        if (sumNum > 0 ) {
            if (!answer.isEmpty()) {
                answer += " + " + String.valueOf(sumNum);
            } else {
                answer = String.valueOf(sumNum);
            }
        }
        
        return answer;
    }
}