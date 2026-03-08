import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= cnt; i++) {
            q.offer(i);
        }
        while (q.size() > 1) {
            q.remove();
            int back = q.poll();
            q.offer(back);
        }
        System.out.println(q.poll());
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}