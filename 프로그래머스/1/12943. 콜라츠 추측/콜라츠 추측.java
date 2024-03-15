class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 0;
        long n = num;
        if(num == 1){
            return answer;
        }
        while(n > 1){
            if(count >= 500){
                break;
            }
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = (n * 3) + 1;
            }
            count++;
        }
        if(count >= 500){
            answer = -1;
        }else{
            answer = count;
        }

        return answer;
    }
}