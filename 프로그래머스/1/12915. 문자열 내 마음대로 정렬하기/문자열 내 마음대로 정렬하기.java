import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = Arrays.copyOf(strings, strings.length);

        Arrays.sort(answer, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);

                if (c1 != c2) {
                    return Character.compare(c1, c2);
                }

                return o1.compareTo(o2);
            }
        });
        return answer;
    }
}