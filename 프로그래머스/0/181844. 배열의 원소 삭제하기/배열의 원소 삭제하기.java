import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = 0; i < delete_list.length; i++) {
            if (list.contains(delete_list[i])) {
                list.remove(list.indexOf(delete_list[i]));
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}