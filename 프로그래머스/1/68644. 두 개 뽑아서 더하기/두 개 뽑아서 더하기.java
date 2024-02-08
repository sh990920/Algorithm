import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> arr = new HashSet<>();

        Arrays.sort(numbers);

        for(int i = numbers.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                arr.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}