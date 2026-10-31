class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) { 

                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int ni = i + x;
                            int nj = j + y;
                            
                            if (ni >= 0 && ni < board.length &&
                                nj >= 0 && nj < board.length &&
                                board[ni][nj] != 1) {
                                board[ni][nj] = 2;
                            }
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}