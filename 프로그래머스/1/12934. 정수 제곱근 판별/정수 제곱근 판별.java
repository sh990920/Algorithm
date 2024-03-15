class Solution {
    public long solution(long n) {
        long answer = 0;
        double a = Math.sqrt(n);
        if(a % 1 != 0.0){
            answer = -1;
        }else{
            long b = (long)a;
            b++;
            answer = b * b;
        }
        return answer;
    }
}