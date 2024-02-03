import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(long n) {
        String[] strs = (n + "").split("");
        int[] answer = new int[strs.length];
        int j = strs.length - 1;
        
        for (int i = 0; i < strs.length; i++, j--) {
            answer[i] = Integer.parseInt(strs[j]);
        }
        
        return answer;
    }
}