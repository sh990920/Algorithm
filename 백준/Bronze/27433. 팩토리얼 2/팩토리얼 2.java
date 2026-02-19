import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(1);
            return;
        }
        long res = p(n, 1);
        System.out.println(res);
    }

    public long p(int n, long result) {
        if (n == 1) {
            return result;
        }
        result *= n;
        return p(n - 1, result);
    }
    
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
