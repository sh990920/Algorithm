class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int depth, int target, int result){
        // 마지막 노드까지 진행을 했을 경우
        if(depth == numbers.length){
            // 값과 합계가 같으면 answer++
            if(target == result){
                answer++;
            }
            return;
        }
        // 양수를 더한값
        int plus = result + numbers[depth];
        // 음수를 더한값
        int minus = result - numbers[depth];
        
        // 깊이 추가
        depth++;
        
        dfs(numbers, depth, target, plus);
        dfs(numbers, depth, target, minus);
        
    }
}