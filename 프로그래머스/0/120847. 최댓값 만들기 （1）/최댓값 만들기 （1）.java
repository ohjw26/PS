class Solution {
    public int solution(int[] numbers) {
        int answer, t = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j+1]) {
                    t = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = t;
                }
            }
        }
        answer = numbers[0] * numbers[1];
        return answer;
    }
}