class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                answer[i] = -1;
            } else {
                String temp = s.substring(0, i);
                int lastIndex = temp.lastIndexOf(s.substring(i, i + 1));
                if (lastIndex > -1) {
                    answer[i] = i - lastIndex;
                } else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}