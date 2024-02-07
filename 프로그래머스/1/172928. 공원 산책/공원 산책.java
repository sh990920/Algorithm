class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int x = 0;
        int y = 0;
        
        char[][] area = new char[park.length][park[0].length()];
        
        for(int i = 0; i < area.length; i++){
            area[i] = park[i].toCharArray();
            
            if(park[i].contains("S")){
                y = i;
                x = park[i].indexOf("S");
            }
        }
        
        for(String route : routes){
            String direction = route.split(" ")[0];
            int len = Integer.parseInt(route.split(" ")[1]);
            
            int x_index = x;
            int y_index = y;
            
            for(int i = 0; i < len; i++){
                switch(direction){
                    case "E":
                        x_index++;
                        break;
                    case "W":
                        x_index--;
                        break;
                    case "S":
                        y_index++;
                        break;
                    case "N":
                        y_index--;
                        
                }
                if(x_index >= 0 && x_index < area[0].length && y_index >= 0 && y_index < area.length){
                    if(area[y_index][x_index] == 'X'){
                        break;
                    }
                    if(i == len - 1){
                        x = x_index;
                        y = y_index;
                    }
                }
            }
        }
        
        
        
        int[] answer = {y, x};
        return answer;
    }
}