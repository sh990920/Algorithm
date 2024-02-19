class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n);
        int[] answer = new int[a.length()];
        int idx = 0;
        for(int i = a.length() - 1; i >= 0; i--){
            answer[idx] = Integer.parseInt(Character.toString(a.charAt(i)));
            idx++;
        }
        return answer;
    }
}