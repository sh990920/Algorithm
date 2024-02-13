class Solution {
    public int solution(String word) {
        String str = "AEIOU";
        int[] arr = {781, 156, 31, 6, 1};
        int index = 0;
        int answer = word.length();
        for(int i = 0; i < word.length(); i++){
            index = str.indexOf(word.charAt(i));
            answer += arr[i] * index;
        }
        return answer;
    }
}