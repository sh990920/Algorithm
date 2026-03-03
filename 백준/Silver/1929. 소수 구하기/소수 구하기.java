import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = 0;
        int second = 0;
        for (int i = 0; i < st.countTokens(); i++) {
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
        }
        for (int i = first; i <= second; i++) {
            if (primeNumber(i)) {
                System.out.println(i);
            }
        }

    }
    public boolean primeNumber(int num) {
        if(num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for(long i = 2; i <= Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}