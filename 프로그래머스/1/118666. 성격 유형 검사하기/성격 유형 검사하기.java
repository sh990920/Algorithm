import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "RCJA";

        String[] arr = {"R", "T", "C", "F", "M", "J", "A", "N"};

        Map<String, Integer> count = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            count.put(arr[i], 0);
        }

        for(int i = 0; i < survey.length; i++){
            String a = Character.toString(survey[i].charAt(0));
            String b = Character.toString(survey[i].charAt(1));
            if(choices[i] == 4){
                continue;
            }else if(choices[i] > 4){
                count.replace(b, count.get(b) + choices[i] - 4);
            }else{
                count.replace(a, count.get(a) + 4 - choices[i]);
            }
        }

        if(count.get("R") < count.get("T")){
            answer = answer.replace("R", "T");
        }
        if(count.get("C") < count.get("F")){
            answer = answer.replace("C", "F");
        }
        if(count.get("J") < count.get("M")){
            answer = answer.replace("J", "M");
        }
        if(count.get("A") < count.get("N")){
            answer = answer.replace("A", "N");
        }
        return answer;
    }
}