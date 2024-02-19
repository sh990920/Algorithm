import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int select = nums.length / 2;
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(numSet.size() > select){
            answer = select;
        }else{
            answer = numSet.size();
        }
        return answer;
    }
}