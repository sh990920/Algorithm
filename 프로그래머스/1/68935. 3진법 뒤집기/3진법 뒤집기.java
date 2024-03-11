class Solution {
    public int solution(int n) {
        int answer = 0;
        String three = "";
        int num = 3;
        int numCount = 1;
        while(n > 0){
            if(n >= num){
                num *= 3;
                numCount++;
                continue;
            }else{
                num /= 3;
                int cnt = n / num;
                three += cnt;
                n %= num;
            }
        }
        int len = three.length();
        if(len < numCount){
            for(int i = 0; i < numCount - len; i++){
                three += "0";
            }
        }

        for(int i = 0; i < three.length(); i++){
            String s = Character.toString(three.charAt(i));
            int res = Integer.parseInt(s);
            if(i == 0){
                answer += res;
            }else{
                answer += res * Math.pow(3, i);
            }
        }
        return answer;
    }
}