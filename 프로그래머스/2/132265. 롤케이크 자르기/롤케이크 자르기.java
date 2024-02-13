import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> first = new HashMap<>();
        Set<Integer> second = new HashSet<>();
        
        for(int i = 0; i < topping.length; i++){
            first.put(topping[i], first.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i = 0; i < topping.length; i++){
            second.add(topping[i]);
            first.put(topping[i], first.get(topping[i]) - 1);
            if(first.get(topping[i]) == 0){
                first.remove(topping[i]);
            }
            if(second.size() == first.size()){
                answer++;
            }
            
        }
        
        return answer;
    }
}