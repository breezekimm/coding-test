class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122)) {

                if ((Character.isUpperCase(chars[i]) && chars[i] + n > 90) || Character.isLowerCase(chars[i]) && chars[i] + n > 122) {
                    chars[i] = (char)((int)chars[i] + n - 26);
                } else {
                    chars[i] = (char)((int)chars[i] + n);
                }
            }
            answer += chars[i];
        }
        return answer;
    }
}