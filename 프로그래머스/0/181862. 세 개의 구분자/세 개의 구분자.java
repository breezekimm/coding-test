import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ");
        String[] answer = myStr.split(" ");
        List<String> tempList = new ArrayList<>();

        for (String s : answer) {
            if (!s.equals("")) {
                tempList.add(s);
            }
        }

        answer = (!tempList.isEmpty()) ? tempList.toArray(tempList.toArray(new String[tempList.size()])) : new String[]{"EMPTY"};
        return answer;
    }
}