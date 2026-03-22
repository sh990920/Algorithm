import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        bw.write((int)Math.pow(2, n) - 1 + "\n");
        hanoi(n, 1, 3);

        bw.flush();
        br.close();
        bw.close();

    }

    public void hanoi(int n, int start, int end) throws Exception {
        if (n == 1) {
            bw.write(start + " " + end + "\n");
            return;
        }
        int aux = 6-end-start;
        hanoi(n - 1, start, aux);
        bw.write(start + " " + end + "\n");
        hanoi(n - 1, aux, end);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}