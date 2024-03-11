import java.util.*;


class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int[] XArr = new int[10];
        int[] YArr = new int[10];

        for(String s : X.split("")){
            int idx = Integer.parseInt(s);
            XArr[idx]++;
        }

        for(String s : Y.split("")){
            int idx = Integer.parseInt(s);
            YArr[idx]++;
        }

        int[] resultArr = new int[10];
        for(int i = 0; i < 10; i++){
            if(XArr[i] > YArr[i]){
                resultArr[i] = YArr[i];
            }else{
                resultArr[i] = XArr[i];
            }
        }

        for(int i = 9; i >= 0; i--){
            for(int j = 0; j < resultArr[i]; j++){
                sb.append(i);
            }
        }

        answer = sb.toString();

        if(answer.equals("")){
            answer = "-1";
        }else if(answer.replace("0", "") == ""){
            answer = "0";
        }

        return answer;
    }
}