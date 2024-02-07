import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        Map<Integer, Integer> attack = Arrays.stream(attacks).collect(Collectors.toMap(array -> array[0], array -> array[1]));

        int answer = health;
        int success = 0;
        int count = 0;

        while(count <= attacks[attacks.length - 1][0]){
            if(count == 0){
                count++;
                continue;
            }
            if(attack.containsKey(count)){
                answer -= attack.get(count);
                success = 0;
                if(answer <= 0){
                    answer = -1;
                    break;
                }
            }else{
                success++;
                if(success == bandage[0]){
                    answer += bandage[1];
                    answer += bandage[2];
                    success = 0;
                }else{
                    answer += bandage[1];
                }
                if(answer >= health){
                    answer = health;
                }
            }
            count++;
        }
        
        return answer;
    }
}