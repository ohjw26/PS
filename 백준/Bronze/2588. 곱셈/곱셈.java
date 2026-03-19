import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine()); //472
        int B = Integer.parseInt(br.readLine()); //385

        int B1 = B % 10; //5
        int B2 = (B/10) % 10; //8
        int B3 = B/100; //3

        int num3 = A*B1;
        int num4 = A*B2;
        int num5 = A*B3;
        int num6 = num3 + num4*10 + num5*100;

        bw.write(num3 + "\n");
        bw.write(num4 + "\n");
        bw.write(num5 + "\n");
        bw.write(num6 + "");
        bw.flush();
    }
}