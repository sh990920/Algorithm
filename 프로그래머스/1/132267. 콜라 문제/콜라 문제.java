class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n >= a){
            int c = 0;
            c += n / a;
            answer += c * b;
            n = (c * b) + (n % a);
        }
        return answer;
    }
}