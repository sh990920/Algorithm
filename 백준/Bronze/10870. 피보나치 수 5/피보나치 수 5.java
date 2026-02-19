import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long res = p(n);
        System.out.println(res);
    }

    public long p(int n) {
        if (n < 2) {
            return n;
        }
        return p(n - 1) + p(n - 2);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
