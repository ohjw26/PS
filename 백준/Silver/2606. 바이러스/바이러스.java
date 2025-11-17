import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static List<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>(); //리스트를 저장하는 배열
        }
        
        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" "); //직접 연결되어 있는 컴퓨터 쌍
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1); //1번 컴퓨터와 연결된.

        bw.write(count - 1 + "\n"); //1제외
        bw.flush();


    }

    private static void dfs(int x) { //깊이우선탐색
        visited[x] = true;
        count++;

//        for (int i = 0; i < graph[x].size(); i++) {
//            int next = graph[x].get(i);
//
//            if(!visited[next]) dfs(next);
//        }
        for (int next : graph[x]) {
            if(!visited[next]) dfs(next);
        }
    }
}