import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Map<Integer, Integer> absMap = new HashMap<>();

        for (int i : numlist) {
            absMap.put(i, Math.abs(n - i));
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(absMap.entrySet());
        entries.sort((o1, o2) -> {
            int valueCompare = o1.getValue().compareTo(o2.getValue());
            if (valueCompare == 0) {
                return o2.getKey().compareTo(o1.getKey());
            }
            return valueCompare;
        });

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap.keySet().stream().mapToInt(Integer::intValue).toArray();
    }
}