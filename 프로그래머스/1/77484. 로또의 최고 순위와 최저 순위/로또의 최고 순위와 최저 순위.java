class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int correct = 0;

        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
                continue;
            }
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    correct++;
                    break;
                }
            }
        }
        int[] answer = new int[2];

        answer[0] = correct + zero;
        answer[1] = correct;

        for(int i = 0; i < answer.length; i++){
            switch (answer[i]){
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
            }
        }
        return answer;
    }
}