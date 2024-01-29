import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for(int i = 0; i < arr.length; i++){
            size += arr[i];
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                arr2.add(arr[i]);
            }
        }
        int[] answer = arr2.stream().mapToInt(i->i).toArray();
        return answer;
    }
}