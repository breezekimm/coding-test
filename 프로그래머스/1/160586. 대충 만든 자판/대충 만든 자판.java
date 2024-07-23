import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        Map<Character, Integer> findKey = new HashMap<>();
        for (String keys : keymap) {
            for (int j = 0; j < keys.length(); j++) {
                char key = keys.charAt(j);
                findKey.put(key, Math.min(findKey.getOrDefault(key, Integer.MAX_VALUE), j + 1));
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int countPress = 0;
            
            for (int j = 0; j < targets[i].length(); j++) {
                Character target = targets[i].charAt(j);
                if (findKey.containsKey(target)) {
                    countPress += findKey.get(target);
                } else {
                    countPress = -1;
                    break;
                }
            }

            answer[i] = countPress;
        }
        return answer;
    }
}