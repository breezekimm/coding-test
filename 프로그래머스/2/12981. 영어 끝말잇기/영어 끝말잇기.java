import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();

        set.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!set.add(words[i]) || words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
                // 탈락자의 번호와 차례 계산
                int num = (i % n) + 1;
                int turn = (i / n) + 1;
                System.out.println(num + ", " +  turn);
                return new int[]{num, turn};
            }
        }
        
        // 탈락자가 없을 경우
        return new int[]{0, 0};
    }
}