class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = my_string;
        
        for(int i = 0; i < indices.length; i++){
            answer = answer.substring(0, indices[i]) + "0" + answer.substring(indices[i] + 1);
        }
        answer = answer.replace("0", "");
        return answer;
    }
}