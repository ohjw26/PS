import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            long A = Long.parseLong(input[0]);
            long B = Long.parseLong(input[1]);

            bw.write((A / B) * (A / B) + "\n");
        }

        bw.flush();
    }
}