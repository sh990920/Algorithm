import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] count = {1, 1, 2, 2, 2, 8};
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] input = new int[st.countTokens()];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < input.length; i++) {
            sb.append(count[i] - input[i]).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}