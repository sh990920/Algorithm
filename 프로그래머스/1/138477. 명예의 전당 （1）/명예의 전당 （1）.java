import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> mvp = new ArrayList<>();
        int[] answer = new int[score.length];
        for(int i = 0; i < answer.length; i++){
            int num = score[i];
            if(i < k){
                mvp.add(score[i]);
            }else{
                if(mvp.get(0) < num){
                    mvp.set(0, num);
                }
            }
            Collections.sort(mvp);
            answer[i] = mvp.get(0);
        }
        return answer;
    }
}