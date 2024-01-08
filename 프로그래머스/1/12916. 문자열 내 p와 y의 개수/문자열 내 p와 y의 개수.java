class Solution {
    boolean solution(String s) {
        String[] strs = (s.toLowerCase()).split("");
        int p = 0;
        int y = 0;

        for (String str : strs) {
            if (str.equals("p")) {
                p++;
            } else if (str.equals("y")) {
                y++;
            }
        }
        
        return p == y;
    }
}