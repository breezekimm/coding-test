import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> arrayList = Arrays.stream(score).boxed().collect(Collectors.toList());
        Collections.sort(arrayList, Collections.reverseOrder());

        int boxPrice = 0;
        for (int i = 0; i < ((score.length / m) * m);) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    boxPrice = m * arrayList.get(i);
                    answer += boxPrice;
                }
                i++;
            }
        }
        return answer;
    }
}