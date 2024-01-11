class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] splitArr = quiz[i].split(" ");
            if (splitArr[1].equals("+")) {
                answer[i] = ((Integer.parseInt(splitArr[0]) + Integer.parseInt(splitArr[2]) == Integer.parseInt(splitArr[4]))) ? "O" : "X";
            } else if (splitArr[1].equals("-")) {
                answer[i] = ((Integer.parseInt(splitArr[0]) - Integer.parseInt(splitArr[2]) == Integer.parseInt(splitArr[4]))) ? "O" : "X";
            }
        }
        return answer;
    }
}