class Solution {
    public int solution(String my_string) {
       String[] strs = my_string.split(" ");
        int answer = Integer.parseInt(strs[0]);

        for (int i = 1; i < strs.length - 1; i++) {
            if (strs[i].equals("+")) {
                answer += Integer.parseInt(strs[i + 1]);
                System.out.println("index : " + i + " answer : " + answer);
            } else if (strs[i].equals("-")) {
                answer -= Integer.parseInt(strs[i + 1]);
                System.out.println("index : " + i + " answer : " + answer);
            }
        }
        
        return answer;
    }
}