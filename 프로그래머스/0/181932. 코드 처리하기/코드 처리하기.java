class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] codeArr = code.split("");

        for (int i = 0; i < codeArr.length; i++) {
            if (mode == 0) {
                if (!codeArr[i].equals("1") && i % 2 == 0) {
                    answer += codeArr[i];
                } else if (codeArr[i].equals("1")) {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (!codeArr[i].equals("1") && i % 2 != 0) {
                    answer += codeArr[i];
                } else if (codeArr[i].equals("1")) {
                    mode = 0;
                }
            }
        }

        answer = (answer.length() != 0) ? answer : "EMPTY";
        return answer;
    }
}