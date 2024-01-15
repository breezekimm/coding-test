import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> tempList = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) {
                tempList.add(s);
            }
        }
        return tempList.toArray(tempList.toArray(new String[0]));
    }
}