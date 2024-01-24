class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] terms = polynomial.split(" ");
        int countX = 0;
        int constant = 0;

        for (String term : terms) {
            if (term.contains("x")) {
                countX += (term.length() > 1) ? (Integer.parseInt(term.replace("x", ""))) : 1;
            } else if (!term.contains("x") && !term.contains("+")) {
                constant += Integer.parseInt(term);
            }
        }

        if (countX == 1) {
            answer = "x";
        } else if (countX > 1) {
            answer = countX + "x";
        }

        if (constant > 0) {
            answer += (countX == 0) ? constant : " + " + constant;
        }
        return answer;
    }
}