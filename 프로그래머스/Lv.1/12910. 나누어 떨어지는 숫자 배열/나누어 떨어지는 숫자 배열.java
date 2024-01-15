import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> tempList = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                tempList.add(i);
            }
        }

        if (tempList.isEmpty()) {
            tempList.add(-1);
        }

        Collections.sort(tempList);
        answer = tempList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}