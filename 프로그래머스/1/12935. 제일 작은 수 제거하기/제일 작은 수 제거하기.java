import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length > 1){
            answer = new int[arr.length - 1];
            int min = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != min){
                    answer[count] = arr[i];
                    count++;
                }
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}