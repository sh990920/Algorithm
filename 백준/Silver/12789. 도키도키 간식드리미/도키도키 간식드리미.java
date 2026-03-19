import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }
        Stack<Integer> stack = new Stack<>();
        int cnt = 1;
        while (!queue.isEmpty() || !stack.isEmpty()) {
            int num = -1;
            if (!queue.isEmpty()) {
                num = queue.peek();
                if (num == cnt) {
                    queue.poll();
                    cnt++;
                    continue;
                }
                if (!stack.isEmpty() && stack.peek() == cnt) {
                    stack.pop();
                    cnt++;
                    continue;
                }
                queue.poll();
                stack.push(num);
            } else {
                num = stack.peek();
                if (num == cnt) {
                    stack.pop();
                    cnt++;
                    continue;
                }
                stack.pop();
            }

        }
        if (cnt == count + 1) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }
        bw.flush();
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}