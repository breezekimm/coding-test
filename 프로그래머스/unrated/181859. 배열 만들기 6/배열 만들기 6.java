import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (answerList.isEmpty() || answerList.get(answerList.size() - 1) != arr[i]) {
                answerList.add(arr[i]);
            } else {
                answerList.remove(answerList.size() - 1);
            }
        }

        if (answerList.isEmpty()) {
            answerList.add(-1);
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}