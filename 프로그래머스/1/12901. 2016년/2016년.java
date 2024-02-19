import java.util.*;

class Solution {
    public String solution(int a, int b) {
        int year = 2016;
        Calendar c = Calendar.getInstance();
        c.set(year, a - 1, b);
        int d = c.get(Calendar.DAY_OF_WEEK);
        String answer = "";
        switch (d){
            case 1:
                answer = "SUN";
                break;
            case 2:
                answer = "MON";
                break;
            case 3:
                answer = "TUE";
                break;
            case 4:
                answer = "WED";
                break;
            case 5:
                answer = "THU";
                break;
            case 6:
                answer = "FRI";
                break;
            case 7:
                answer = "SAT";
        }
        return answer;
    }
}