import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int next = 0;

        if (isNumber(a)) {
            next = Integer.parseInt(a) + 3;
        } else if (isNumber(b)) {
            next = Integer.parseInt(b) + 2;
        } else if (isNumber(c)) {
            next = Integer.parseInt(c) + 1;
        }

        if (next % 3 == 0 && next % 5 == 0) { //next % 15 == 0
            System.out.println("FizzBuzz");
        } else if (next % 3 == 0) {
            System.out.println("Fizz");
        } else if (next % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(next);
        }
    }

    static boolean isNumber(String s){
        return s.charAt(0) >= '0' && s.charAt(0) <= '9';
    }
}