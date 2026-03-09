import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        bw.write("<");
        while(!q.isEmpty()) {
            int count = cnt;
            if (q.size() == 1) {
                bw.write(q.poll() + "");
                break;
            }
            while (count > 0) {
                count--;
                if (count == 0) {
                    bw.write(q.poll() + ", ");
                    break;
                }
                int x = q.poll();
                q.add(x);
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}