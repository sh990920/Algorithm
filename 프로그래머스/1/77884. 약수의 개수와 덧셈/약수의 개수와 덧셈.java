import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> count_list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int c = count(i);
            count_list.add(c);
        }
        
        for(int i = 0; i < count_list.size(); i++){
            if(count_list.get(i) % 2 != 0){
                answer -= i + left;
            }else{
                answer += i + left;
            }
        }
        
        return answer;
    }
    
    public static int count(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count++;
            }
        }
        return count;
    }
}