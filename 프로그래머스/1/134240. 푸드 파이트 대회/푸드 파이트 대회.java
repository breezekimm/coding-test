class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 == 0) {
                answer += (i + "").repeat(food[i] / 2);
            } else if (food[i] % 2 != 0 && food[i] != 1) {
                answer += (i + "").repeat((food[i] - 1) / 2);
            }
        }
        
        StringBuilder sb = new StringBuilder(answer);
        answer += "0" + sb.reverse();
        
        return answer;
    }
}