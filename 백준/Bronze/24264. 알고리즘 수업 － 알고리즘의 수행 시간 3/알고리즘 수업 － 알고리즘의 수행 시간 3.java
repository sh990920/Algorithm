import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.println(n * n);
        System.out.println(2);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
