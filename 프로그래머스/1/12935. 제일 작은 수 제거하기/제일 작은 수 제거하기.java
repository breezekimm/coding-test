import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        Set<Integer> set = new LinkedHashSet<>();

        if (arr.length == 1) {
            answer = new int[]{-1};
        } else {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            set.remove(min);
            answer = set.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}