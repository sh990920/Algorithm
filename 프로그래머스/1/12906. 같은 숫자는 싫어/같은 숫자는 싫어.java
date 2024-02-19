import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < arr.length;){
            nums.add(arr[i]);
            int idx = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    idx++;
                }else{
                    break;
                }
            }
            i += idx;
        }
        int[] answer = nums.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}