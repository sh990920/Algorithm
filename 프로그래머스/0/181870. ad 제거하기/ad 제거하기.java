import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                arr.add(strArr[i]);
            }
        }
        int size = arr.size();
        String[] answer = arr.toArray(new String[size]);
        return answer;
    }
}