import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer;
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j < intervals[i][intervals.length - 1] + 1; j++) {
                answerList.add(arr[j]);
            }
        }

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}