import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int five = N / 5; // 최대로 쓸 수 있는 5kg 봉지 개수
        int answer = -1;

        while (five >= 0) {
            int rest = N - five * 5;

            if (rest % 3 == 0) {
                int three = rest / 3;
                answer = five + three;
                break;
            }
            five--;
        }
        bw.write(answer + "");
        bw.flush();
    }
}