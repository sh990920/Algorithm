import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long cnt = n * n * n;
        System.out.println(cnt);
        System.out.println("3");
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}