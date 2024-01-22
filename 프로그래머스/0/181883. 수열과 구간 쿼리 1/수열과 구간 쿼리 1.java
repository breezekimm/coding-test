import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);

        for (int[] query : queries) {
            int begin = query[0];
            int end = query[1];

            for (int i = begin; i <= end; i++ ) {
                answer[i]++;
            }
        }
        return answer;
    }
}