class Solution {
    public int[] solution(int[] arr, int[][] queries) {
//         int[] answer = new int[arr.length];
        
//         for(int i = 0; i < arr.length; i++){
//             answer[i] = arr[i];
//         }
        
//         for(int i = 0; i < queries.length; i++){
//             for(int j = 0; j < queries[i].length; j++){
//                 int idx = queries[i][j];
//                 answer[idx] += 1;
//             }
//         }
        
//         return answer;
        for ( int[] query : queries ) {
            int s = query[ 0 ];
            int e = query[ 1 ];
            for ( int i = s; i <= e; i++ ) {
                arr[ i ] += 1;
            }
        }
        return arr;
    }
}