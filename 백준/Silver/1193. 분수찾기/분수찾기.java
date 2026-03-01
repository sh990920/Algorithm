import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int cnt = 1;
        int count = 0;
        int first = 0;
        int second = 0;
        while(num > count) {
            count += cnt;
            cnt++;
            if (cnt % 2 != 0) {
                second = 1;
                first = cnt - 1;
            } else {
                second = cnt - 1;
                first = 1;
            }
        }
        if (count != num) {
            if (cnt % 2 != 0) {
                first -= (count - num);
                second += (count - num);
            } else {
                first += (count - num);
                second -= (count - num);
            }

        }
        System.out.printf("%d/%d", first, second);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}