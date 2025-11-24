import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            dp[0][i] = i;
        }

        for (int k = 1; k <= 14; k++) {
            for (int n = 1; n <= 14; n++) {
                dp[k][n] = dp[k-1][n] + dp[k][n-1];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(dp[k][n] + "\n");
        }
        bw.flush();
    }
}