class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String front = phone_number.substring(0, phone_number.length() - 4);
        front = front.replaceAll(".", "*");
        String back = phone_number.substring(phone_number.length() - 4, phone_number.length());
        answer = front + back;
        return answer;
    }
}