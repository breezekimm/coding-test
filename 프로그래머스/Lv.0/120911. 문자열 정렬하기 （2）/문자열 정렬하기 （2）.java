import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] charArr = (my_string.toLowerCase()).toCharArray();
        Arrays.sort(charArr);

        for (char c : charArr) {
            answer += c;
        }
        
        return answer;
    }
}