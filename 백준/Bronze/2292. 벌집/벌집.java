import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        
        int layer = 1;
        int end = 1;
        
        while (N > end) {
            end += 6 * layer;
            layer++;
        }
        
        bw.write(layer + "\n");
        bw.flush();
    }
}