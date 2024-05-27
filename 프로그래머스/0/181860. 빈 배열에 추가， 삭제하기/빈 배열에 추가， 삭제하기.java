import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};

        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answerList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answerList.remove(answerList.size() - 1);
                }
            }
        }

        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}