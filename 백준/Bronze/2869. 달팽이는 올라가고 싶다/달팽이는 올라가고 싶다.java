import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long A = Long.parseLong(input[0]);
        long B = Long.parseLong(input[1]);
        long V = Long.parseLong(input[2]);

        long days = (V - A) / (A - B);
        if ((V - A) % (A - B) != 0) {
            days++;
        }

        bw.write(days +1 + "\n");
        bw.flush();
    }
}