import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> strList = new ArrayList<>();

        for (String s : my_string.split("")) {
            if (!strList.contains(s)) {
                strList.add(s);
            }
        }

        answer = String.join("", strList);
        return answer;
    }
}