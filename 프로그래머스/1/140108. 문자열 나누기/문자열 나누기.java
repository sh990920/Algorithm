class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.length() == 1){
            answer++;
        }else{
            outer : while(s.length() > 0){
                String x = "";
                int a = 0;
                int b = 0;
                for(int i = 0; i < s.length(); i++){
                    if(i == 0){
                        x = Character.toString(s.charAt(i));
                        a++;
                        continue;
                    }
                    String c = Character.toString(s.charAt(i));
                    if(x.equals(c)){
                        a++;
                    }else{
                        b++;
                    }
                    if(a == b){
                        answer++;
                        s = s.substring(a + b);
                        break;
                    }else if(a + b == s.length()){
                        answer++;
                        break outer;
                    }
                }
                if(s.length() != 0 && s.length() <= 1){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}