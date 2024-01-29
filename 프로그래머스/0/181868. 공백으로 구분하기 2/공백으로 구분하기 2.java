class Solution {
    public String[] solution(String my_string) {
        String words = my_string.trim().replaceAll("\\s+", " ");
        String[] answer = words.split(" ");
        return answer;
    }
}