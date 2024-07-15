class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String string : str) {
            int num = Integer.parseInt(string);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        answer = min + " " + max;
        return answer;
    }
}