class Solution {
    public int[] solution(String myString) {
        myString += " ";
        String[] arr = myString.split("x");
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i].trim().length();
        }
        return answer;
    }
}