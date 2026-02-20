import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            String str = br.readLine();
            int[] res = isPalindrome(str);
            System.out.println(res[0] + " " + res[1]);
        }

    }

    public static int[] recursion(String s, int l, int r, int cnt){
        cnt++;
        if(l >= r) return new int[]{1, cnt};
        else if(s.charAt(l) != s.charAt(r)) return new int[]{0, cnt};
        else return recursion(s, l+1, r-1, cnt);
    }
    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }


    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}