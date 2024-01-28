import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer;
        List<Integer> tempList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                tempList = tempList.subList(0, query[i] + 1);
            } else {
                tempList = tempList.subList(query[i], tempList.size());
            }
        }
        answer = tempList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}