class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        if(my_string.length() <= overwrite_string.length() + s){
            answer = my_string.substring(0, s) + overwrite_string;
        }else{
            answer = my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length() + s);
        }
        return answer;
    }
}