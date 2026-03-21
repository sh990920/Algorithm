import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                count += n / 5;
                n = 0;
                break;
            }
            count++;
            n -= 3;
        }

        if (n < 0) {
            bw.write("-1");
        } else {
            bw.write(count + "\n");
        }


        bw.flush();
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}