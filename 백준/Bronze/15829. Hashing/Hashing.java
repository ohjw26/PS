import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long M = 1234567891;
        long r = 31;

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        long sum = 0;
        long pow = 1;

        for (int i = 0; i < L; i++) {
            sum = (sum + (s.charAt(i) - 96) * pow) % M;
            pow = (pow * r) % M;
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}