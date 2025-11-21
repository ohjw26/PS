import java.io.*;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); //정점
        int M = Integer.parseInt(input[1]); //간선

        graph = new ArrayList[N+1];
        visited = new boolean[N+1];

        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            String[] vertex = br.readLine().split(" ");
            int u = Integer.parseInt(vertex[0]);
            int v = Integer.parseInt(vertex[1]);

            graph[u].add(v);
            graph[v].add(u);
        }

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }

    static void dfs(int x) {
        visited[x] = true;

        for (int next : graph[x]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}