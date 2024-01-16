import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> falseList = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(!finished[i]){
                falseList.add(todo_list[i]);
            }
        }
        String[] answer = falseList.toArray(new String[0]);
        return answer;
    }
}