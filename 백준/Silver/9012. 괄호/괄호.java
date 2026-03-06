import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "");
            Stack<Character> stack = new Stack<>();
            char[] arr = st.nextToken().toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (stack.empty()) {
                    if (arr[j] == ')') {
                        stack.push(arr[j]);
                        break;
                    }
                    stack.push(arr[j]);
                } else {
                    if (stack.peek() == arr[j]) {
                        stack.push(arr[j]);
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}