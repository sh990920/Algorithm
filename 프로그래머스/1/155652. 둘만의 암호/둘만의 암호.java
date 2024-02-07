class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            int count = 0;
            while(count < index){
                word = (char)((word + 1 - 'a') % 26 + 'a');
                if(skip.contains(Character.toString(word))){
                    continue;
                }
                count++;
            }
            answer += word;
        }
        return answer;
    }
}