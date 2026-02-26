import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
                continue;
            }
            stack.push(num);
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        System.out.println(res);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}