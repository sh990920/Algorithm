import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> num = new HashMap<>();
        
        for(int i = 0; i < name.length; i++){
            num.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            int count = 0;
            for(String key : num.keySet()){
                if(Arrays.asList(photo[i]).contains(key)){
                    count += num.get(key);
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}