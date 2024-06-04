import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        Map<Integer, Double> stageRate = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            int challenge = 0;
            int nonePass = 0;
            double failureRate = 0;
            
            for (int stage : stages) {
                if (stage >= i) {
                    challenge++;
                }
                if (stage == i) {
                    nonePass++;
                }
            }

            failureRate = (challenge == 0 && nonePass == 0) ? 0 : (double)nonePass/challenge;
            stageRate.put(i, failureRate);
        }

        answer = stageRate.entrySet().stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
                .mapToInt(Map.Entry::getKey)
                .toArray()
                ;
        return answer;
    }
}