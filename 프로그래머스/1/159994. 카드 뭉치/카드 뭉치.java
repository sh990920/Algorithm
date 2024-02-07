import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int[] arr = new int[cards1.length];
        int[] arr2 = new int[cards2.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Arrays.asList(goal).indexOf(cards1[i]);
            if(arr[i] != -1){
                for(int j = 0; j < i; j++){
                    if(arr[j] == -1){
                        answer = "No";
                        break;
                    }
                    if(arr[i] < arr[j]){
                        answer = "No";
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Arrays.asList(goal).indexOf(cards2[i]);
            if(arr2[i] != -1){
                for(int j = 0; j < i; j++){
                    if(arr2[j] == -1){
                        answer = "No";
                        break;
                    }
                    if(arr2[i] < arr2[j]){
                        answer = "No";
                        break;
                    }
                }
            }
        }
        
        
        return answer;
    }
}