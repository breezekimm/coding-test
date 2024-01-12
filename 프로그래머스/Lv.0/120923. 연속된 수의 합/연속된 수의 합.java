class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int mid = (num % 2 == 0) ? ((total / num) + 1) : (total / num);
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = mid - ((answer.length / 2) - i);
        }
        
        return answer;
    }
}