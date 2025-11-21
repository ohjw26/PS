import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int paintMin = 65;

        //8*8 시작점 범위
        for (int y = 0; y <= n - 8; y++) {
            for (int x = 0; x <= m - 8; x++) {
                int countW = 0; //W로 시작하는 체스판인 경우
                int countB = 0;

                //8*8
                for (int i = y; i < y + 8; i++) {
                    for (int j = x; j < x + 8; j++) {

                        if ((i + j) % 2 == 0) { // 짝수칸(시작칸)
                            if (board[i][j] != 'W') countW++;
                            if (board[i][j] != 'B') countB++;
                        }else { //홀수칸
                            if (board[i][j] != 'B') countW++;
                            if (board[i][j] != 'W') countB++;
                        }
                    }
                }

                int min = Math.min(countW, countB);
                paintMin = Math.min(paintMin, min);
            }
        }
        bw.write(paintMin + "\n");
        bw.flush();
    }
}
