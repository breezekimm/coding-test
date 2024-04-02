import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Map<Integer, Integer> rank = new HashMap<>();
        rank.put(0, 6);
        rank.put(1, 6);
        rank.put(2, 5);
        rank.put(3, 4);
        rank.put(4, 3);
        rank.put(5, 2);
        rank.put(6, 1);

        int cntMatch = 0;
        int cntZero = 0;

        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                cntZero++;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    cntMatch++;
                }
            }
        }

        answer[0] = rank.get(cntMatch + cntZero);
        answer[1] = rank.get(cntMatch);
        return answer;
    }
}