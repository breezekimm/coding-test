class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for (int[] query : queries) {
            String prefix = (query[0] != 0) ? my_string.substring(0, query[0]) : "";
            String suffix = (query[1] != my_string.length()) ? my_string.substring(query[1] + 1) : "";

            my_string = prefix + new StringBuilder(my_string.substring(query[0], query[1] + 1)).reverse() + suffix;
        }
        answer = my_string;
        return answer;
    }
}