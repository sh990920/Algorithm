import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i : section){
            arr.add(i);
        }
        
        for(int i = 0; i < section.length; i++){
            int num = section[i];
            if(arr.contains(num)){
                answer++;
                for(int j = num + m - 1; j >= num; j--){
                    if(arr.contains(j)){
                        arr.remove(Integer.valueOf(j));
                    }
                }
            }
        }
        
        return answer;
    }
}