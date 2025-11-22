import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 1; i < N; i++) {
            int sum = i + digitSum(i); //분해합

            if (sum == N) {
                result = i;
                break; //최소값을 찾은 후 바로 종료
            }
        }
        bw.write(result + "\n");
        bw.flush();
    }

    // 각 자리수 합을 구하는 함수
    static int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}