import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);

        for (int[] query : queries) {
            List<Integer> tempNums = new ArrayList<>();
            for (int i = query[0]; i <= query[1]; i++) {
                if (i % query[2] == 0) {
                    tempNums.add(i);
                }
            }
            for(int j = 0; j < tempNums.size(); j++) {
                answer[tempNums.get(j)]++;
            }
        }

        return answer;
    }
}