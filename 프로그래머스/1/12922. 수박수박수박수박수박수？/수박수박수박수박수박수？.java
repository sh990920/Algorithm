class Solution {
    public String solution(int n) {
        String answer = "";
        int count = 0;
        boolean odd = false;
        if(n % 2 == 0){
            count = n / 2;
        }else{
            count = n / 2;
            odd = true;
        }
        for(int i = 0; i < count; i++){
            answer += "수박";
        }
        if(odd){
            answer += "수";
        }
        return answer;
    }
}