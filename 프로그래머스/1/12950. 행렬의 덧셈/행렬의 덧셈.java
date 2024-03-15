import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++){
            List<Integer> nums = new ArrayList<>();
            for(int j = 0; j < arr1[i].length; j++){
                nums.add(arr1[i][j] + arr2[i][j]);
            }
            list.add(nums);
        }
        int[][] answer = new int[list.size()][];
        for(int i = 0; i < list.size(); i++){
            answer[i] = new int[list.get(i).size()];
        }
        
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).size(); j++){
                answer[i][j] = list.get(i).get(j);
            }
        }
        return answer;
    }
}