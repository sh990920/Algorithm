import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static int num = 1;
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        while (num < n) {
            num += (6 * cnt);
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}