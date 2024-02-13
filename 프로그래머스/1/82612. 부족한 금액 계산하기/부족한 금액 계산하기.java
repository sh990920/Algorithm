class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0l;
        long pay = 0l;
        for(int i = 1; i <= count; i++){
            pay += price * i;
        }
        if(pay > money){
            answer = pay - money;
        }

        return answer;
    }
}