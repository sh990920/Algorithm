import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        for(int i = 0; i < record.length; i++){
            String[] chat = record[i].split(" ");
            if(chat[0].equals("Enter")){
                if(!map.containsKey(chat[1])){
                    map.put(chat[1], chat[2]);
                }else {
                    map.replace(chat[1], chat[2]);
                }
            }else if(chat[0].equals("Change")){
                map.replace(chat[1], chat[2]);
            }
        }
        List<String> chatList = new ArrayList<>();
        for(int i = 0; i < record.length; i++){
            String[] chat = record[i].split(" ");
            switch (chat[0]){
                case "Enter":
                    chatList.add(String.format("%s님이 들어왔습니다.", map.get(chat[1])));
                    break;
                case "Leave":
                    chatList.add(String.format("%s님이 나갔습니다.", map.get(chat[1])));
            }
        }
        int len = chatList.size();
        String[] answer = chatList.toArray(new String[len]);
        return answer;
    }
}