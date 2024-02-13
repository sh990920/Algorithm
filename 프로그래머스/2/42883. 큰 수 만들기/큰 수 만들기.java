class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        char[] arr = number.toCharArray();
        int len = arr.length - k;
        
        int start = 0;
        
        for(int i = 0; i < len; i++){
            char max = '0';
            for(int j = start; j <= i + k; j++){
                if(arr[j] > max){
                    max = arr[j];
                    start = j + 1;
                }
            }
            sb.append(Character.toString(max));
        }
        String answer = sb.toString();
        return answer;
    }
}