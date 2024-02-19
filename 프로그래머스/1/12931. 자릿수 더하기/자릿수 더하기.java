import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String a = Integer.toString(n);
        for(int i = 0; i < a.length(); i++){
            String b = Character.toString(a.charAt(i));
            answer += Integer.parseInt(b);
        }
        return answer;
    }
}