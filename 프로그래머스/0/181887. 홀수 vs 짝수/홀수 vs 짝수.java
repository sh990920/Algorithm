class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                a += num_list[i];
            }else{
                b += num_list[i];
            }
        }
        int answer = 0;
        if(a >= b){
            answer = a;
        }else{
            answer = b;
        }
        return answer;
    }
}