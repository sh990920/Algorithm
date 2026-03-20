import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        bw.write(arr[count-1] * arr[0] + "\n");
        bw.flush();
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}