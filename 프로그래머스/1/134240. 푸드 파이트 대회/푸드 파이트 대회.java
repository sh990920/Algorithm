class Solution {
    public String solution(int[] food) {
        String answer = "";
        String left = "";
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 != 0){
                food[i] = food[i] - 1;
            }
            left += Integer.toString(i).repeat(food[i] / 2);
        }
        answer = left + "0";
        for(int i = left.length() - 1; i >= 0; i--){
            answer += left.charAt(i);
        }
        
        return answer;
    }
}