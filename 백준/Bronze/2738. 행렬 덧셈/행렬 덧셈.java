
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String line = reader.readLine();
        String[] tokens = line.split(" ");
        int n = Integer.parseInt(tokens[0]); //3
        int m = Integer.parseInt(tokens[1]); //3

        int[][] matrix = new int[n][m];
        int[][] matrix2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            tokens = line.split(" ");

            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);
                //matrix2[i][j] = Integer.parseInt(tokens[j]);
            }
        }



        for (int i = 0; i < n; i++) {
            line = reader.readLine();
            tokens = line.split(" ");

            for (int j = 0; j < m; j++) {
                matrix2[i][j] = Integer.parseInt(tokens[j]);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 matrix[i][j] += matrix2[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
