import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] temp = (n + "").split("");
        Arrays.sort(temp, Collections.reverseOrder());

        String answerStr = "";
        for (String s : temp) {
            answerStr += s;
        }

        answer = Long.parseLong(answerStr);
        return answer;
    }
}