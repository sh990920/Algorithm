import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = -999;
        int y = -999;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        outer: while (x <= 999) {
            while (y <= 999) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    break outer;
                }
                y++;
            }
            x++;
            y = -999;
        }
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}