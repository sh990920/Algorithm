import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> ranking = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            ranking.put(players[i], i);
        }
        for(String player : callings){
            int playerIdx = ranking.get(player);
            
            String frontPlayer = players[playerIdx - 1];
            
            ranking.replace(frontPlayer, playerIdx);
            players[playerIdx] = frontPlayer;
            
            ranking.replace(player, playerIdx - 1);
            players[playerIdx - 1] = player; 
        }
        return players;
    }
}