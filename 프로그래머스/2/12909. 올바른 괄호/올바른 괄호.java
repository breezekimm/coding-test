class Solution {
    boolean solution(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            balance += c == '(' ? 1 : -1;
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }
}