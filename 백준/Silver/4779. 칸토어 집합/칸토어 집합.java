import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null && !(str.isEmpty())) {
            int n = Integer.parseInt(str);
            String result = p(n);
            System.out.println(result);
        }
    }

    public String p(int n) {
        if (n == 0) {
            return "-";
        }
        String str = " ".repeat((int) Math.pow(3, n - 1));
        return p(n - 1) + str + p(n - 1);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}