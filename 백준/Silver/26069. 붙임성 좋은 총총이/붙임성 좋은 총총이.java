import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static String chong = "ChongChong";
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String first = st.nextToken();
            String second = st.nextToken();
            if (set.isEmpty()) {
                if (first.equals(chong) || second.equals(chong)) {
                    set.add(first);
                    set.add(second);
                }
            } else {
                if (set.contains(first) || set.contains(second)) {
                    set.add(first);
                    set.add(second);
                }
            }

        }
        System.out.println(set.size());
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}