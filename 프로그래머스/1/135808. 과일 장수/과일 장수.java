import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> arr = Arrays.stream(score).boxed().collect(Collectors.toList());
        Collections.sort(arr, Collections.reverseOrder());
        
        for(int i = m - 1; i < arr.size(); i+=m){
            answer += arr.get(i) * m;
        }
        return answer;
    }
}