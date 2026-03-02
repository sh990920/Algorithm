import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long cnt = Long.parseLong(br.readLine());
        for (long i = 0; i < cnt; i++) {
            long num = Long.parseLong(br.readLine());
            while(true) {
                if (primeNumber(num)) {
                    System.out.println(num);
                    break;
                } else {
                    num++;
                }
            }
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