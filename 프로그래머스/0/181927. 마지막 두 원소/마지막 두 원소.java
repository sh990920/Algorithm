class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int a = num_list.length;
        for(int i = 0; i < a; i++){
            answer[i] = num_list[i];
        }
        if(num_list[a - 1] > num_list[a - 2]){
            answer[a] = num_list[a - 1] - num_list[a - 2];
        }else{
            answer[a] = num_list[a - 1] * 2;
        }
        return answer;
    }
}