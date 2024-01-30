class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;

        for (int i = 0; i < k * 2; i+=2) {
            if (i > numbers.length - 1) {
                answer = numbers[(i - numbers.length) % numbers.length];
            } else {
                answer = numbers[i];
            }
        }
        
        return answer;
    }
}