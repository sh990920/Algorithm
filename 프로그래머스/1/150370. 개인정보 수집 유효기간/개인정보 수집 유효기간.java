import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> res = new ArrayList<>();

        String[] date = today.split("\\.");
        int today_days = ((Integer.parseInt(date[0]) * 12) + Integer.parseInt(date[1])) * 28 + Integer.parseInt(date[2]);

        Map<String, Integer> term = new HashMap<>();
        for(int i = 0; i < terms.length; i++){
            String name = terms[i].split(" ")[0];
            int month = Integer.parseInt(terms[i].split(" ")[1]);
            term.put(name, month);
        }

        for(int i = 0; i < privacies.length; i++){
            String[] info = privacies[i].split(" ");
            String[] info_date = info[0].split("\\.");
            int info_days = ((Integer.parseInt(info_date[0]) * 12) + Integer.parseInt(info_date[1])) * 28 + Integer.parseInt(info_date[2]);
            int info_month = term.get(info[1]).intValue();
            info_days += info_month * 28;
            if(info_days <= today_days){
                res.add(i + 1);
            }
        }

        int[] answer = res.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}