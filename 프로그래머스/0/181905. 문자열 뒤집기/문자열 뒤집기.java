class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String a = my_string.substring(0, s);
        String b = my_string.substring(s, e + 1);
        String c = my_string.substring(e + 1);
        String d = "";
        for(int i = b.length() - 1; i >= 0; i--){
            d += b.charAt(i);
        }
        answer = a + d + c;
        return answer;
    }
}