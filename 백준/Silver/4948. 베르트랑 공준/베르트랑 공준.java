import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        while (n != 0) {
            long first = n + 1;
            long second = n * 2;
            long cnt = 0;
            for (long i = first; i <= second; i++) {
                if (primeNumber(i)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
            n = Long.parseLong(br.readLine());
        }
    }
    public boolean primeNumber(long num) {
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