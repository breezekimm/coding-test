import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        Set<Integer> answerSet = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answerSet.add(i);
            }
        }
        answer = answerSet.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}