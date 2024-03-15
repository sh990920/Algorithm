import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = Integer.toString(x);
        List<Integer> numList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            numList.add(s.charAt(i) - '0');
        }
        int num = 0;
        for(int i = 0; i < numList.size(); i++){
            num += numList.get(i);
        }
        if(x % num != 0){
            answer = false;
        }
        return answer;
    }
}