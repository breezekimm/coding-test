import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i); // 등수, 번호
            if (attendance[i]) {
                list.add(rank[i]);
            }
        }

        Collections.sort(list);
        answer = (map.get(list.get(0)) * 10000) + (map.get(list.get(1)) * 100) + map.get(list.get(2));

        return answer;
    }
}