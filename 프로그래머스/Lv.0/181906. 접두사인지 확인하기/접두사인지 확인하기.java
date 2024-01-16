class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String s = "";
        for(int i = 0; i < my_string.length(); i++){
            s += my_string.charAt(i);
            if(s.equals(is_prefix)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}