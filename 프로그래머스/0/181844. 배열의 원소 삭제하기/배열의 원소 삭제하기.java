class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int size = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    arr[i] = 0;
                    break;
                }
            }
            if(arr[i] != 0){
                size++;
            }
        }
        int[] answer = new int[size];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}