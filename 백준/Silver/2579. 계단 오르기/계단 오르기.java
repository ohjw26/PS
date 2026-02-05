import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] score = new int[N+1];
        for (int i = 1; i <= N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            bw.write(score[1] + "");
            bw.flush();
            return;
        }
        if (N == 2) {
            bw.write((score[1]+ score[2]) + "");
            bw.flush();
            return;
        }

        int[] dp = new int[N + 1];
        dp[1] = score[1];
        dp[2] = score[1] + score[2];
        dp[3] = Math.max(score[1] + score[3], score[2] + score[3]);

        for (int i = 4; i <= N; i++) {
            dp[i] = Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
        }
        bw.write(dp[N] + "");
        bw.flush();
    }
}