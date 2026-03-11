import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                count += set.size();
                set.clear();
            } else {
                set.add(str);
            }
        }
        count += set.size();
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}