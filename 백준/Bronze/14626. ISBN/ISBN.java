import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String isbn = br.readLine();
        int[] arr = new int[13];
        int star = -1;
        int sum = 0;

        for (int i = 0; i < 13; i++) {
            char c = isbn.charAt(i);

            if (c == '*') {
                arr[i] = -1;
                star = i; // * 위치
            } else {
                arr[i] = c - '0';
            }
        }

        // *제외 가중치 합 계산
        for (int i = 0; i < 13; i++) {
            if (arr[i] == -1) continue;

            if ((i + 1) % 2 == 1) {
                sum += arr[i];
            } else {
                sum += arr[i] * 3;
            }
        }

        for (int x = 0; x <= 9; x++) {
            int temp = sum;

            if (star % 2 == 0) {
                temp += x;
            } else {
                temp += x * 3;
            }

            if (temp % 10 == 0) {
                bw.write(x + "");
                break;
            }
        }
        bw.flush();
    }
}