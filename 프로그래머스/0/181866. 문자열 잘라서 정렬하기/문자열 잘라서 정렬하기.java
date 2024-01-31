import java.util.*;

class Solution {
    public String[] solution(String myString) {
        myString = myString.replace("x", " ").replaceAll("\\s+", " ");
        String[] answer = myString.trim().split(" ");
        Arrays.sort(answer);
        return answer;
    }
}