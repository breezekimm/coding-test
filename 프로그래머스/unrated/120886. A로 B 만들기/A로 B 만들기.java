import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeStrs = before.toCharArray();
        char[] afterStrs = after.toCharArray();

        Arrays.sort(beforeStrs);
        Arrays.sort(afterStrs);

        answer = (new String(beforeStrs).equals(new String(afterStrs))) ? 1 : 0;

        return answer;
    }
}