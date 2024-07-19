import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] countX = new int[10];
        int[] countY = new int[10];

        for (String string : X.split("")) {
            countX[Integer.parseInt(string)]++;
        }
        for (String string : Y.split("")) {
            countY[Integer.parseInt(string)]++;
        }

        List<String> sameStr = new ArrayList<>();
        for (int i = 0; i < countX.length; i++) {
            if (countX[i] > 0 && countY[i] > 0) {
                for (int j = 0; j < Math.min(countX[i], countY[i]); j++) {
                    sameStr.add(String.valueOf(i));
                }
            }
        }


        // 짝꿍이 존재하지 않는 케이스
        if (sameStr.isEmpty()) {
            return "-1";
        }

        for (int i = 9; i >= 0; i--) {
            int count = Math.min(countX[i], countY[i]);
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }

        // 짝꿍이 0으로만 이루어진 케이스
        if (answer.toString().replace("0", "").isEmpty()) {
            return "0";
        }

        return answer.toString();
    }
}