class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                answer += " ";
                idx = 0;
            }else{
                if(idx % 2 == 0){
                    answer += Character.toString(s.charAt(i)).toUpperCase();
                }else{
                    answer += Character.toString(s.charAt(i)).toLowerCase();
                }
                idx++;
            }
        }
        return answer;
    }
}