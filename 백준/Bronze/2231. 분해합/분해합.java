import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean isTrue = false;

        for(int i = 1; i <= n; i++){
            String str = String.valueOf(i);
            int sum = i;
            for (int j = 0; j < str.length(); j++){
                sum += Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            if (n == sum) {
                bw.write(i + "\n");
                isTrue = true;
                break;
            }
        }
        if (!isTrue){
            bw.write(0 + "\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}