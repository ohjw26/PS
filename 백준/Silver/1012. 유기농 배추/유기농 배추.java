import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[][] board;
    static boolean[][] visited;
    static int M, N;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            M = Integer.parseInt(input[0]); //가로
            N = Integer.parseInt(input[1]); //세로
            int K = Integer.parseInt(input[2]); //배추 개수

            board = new int[N][M];
            visited = new boolean[N][M];
            int count = 0;

            // 배추 위치 입력
            for (int j = 0; j < K; j++) {
                String[] pos = br.readLine().split(" ");
                int x = Integer.parseInt(pos[0]);
                int y = Integer.parseInt(pos[1]);
                board[y][x] = 1;
            }

            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (board[y][x] == 1 && !visited[y][x]) {
                        dfs(x, y);
                        count++;
                    }
                }
            }
            bw.write(count + "\n");

        }
        bw.flush();
    }

    static void dfs(int x, int y) {
        visited[y][x] = true;

        //(x, y)의 상하좌우
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (board[ny][nx] == 1 && !visited[ny][nx]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}