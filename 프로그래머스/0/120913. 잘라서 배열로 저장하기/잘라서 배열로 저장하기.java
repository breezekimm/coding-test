class Solution {
    public String[] solution(String my_str, int n) {
        int length = (my_str.length() % n == 0) ? (my_str.length() / n) : (my_str.length() / n + 1);
        String[] answer = new String[length];
        int beginIndex = 0;
        int endIndex = n;

        for (int i = 0; i < answer.length; i++) {
            if (i != answer.length - 1) {
                answer[i] = my_str.substring(beginIndex, endIndex);
                beginIndex += n;
                endIndex += n;
            } else {
                answer[i] = my_str.substring(beginIndex);
            }
        }
        return answer;
    }
}