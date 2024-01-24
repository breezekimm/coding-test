import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);

        for (int j = 0; j < queries.length; j++) {
            int x = queries[j][0];
            int y = queries[j][1];
            int temp = answer[x];
            answer[x] = answer[y];
            answer[y] = temp;
        }
        return answer;
    }
}