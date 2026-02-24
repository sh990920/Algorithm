import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            list[i] = num;
        }
        Arrays.sort(list);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int num : list){
            bw.write(String.valueOf(num));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}