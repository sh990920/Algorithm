import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String c = "";
        for(int i = 0; i < a.length(); i++){
            int b = (int)a.charAt(i);
            if(b >= 65 && b <= 90){
                c +=(char)(b + 32);
            }else if(b >= 97 && b <= 122){
                c +=(char)(b - 32);
            }
        }
        System.out.println(c);
    }
}