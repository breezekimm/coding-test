import java.util.stream.IntStream;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] knights = IntStream.rangeClosed(1, number).toArray();

        for (int knight : knights) {
            int count = 0;

            for (int j = 1; j * j <= knight; j++) {
                if (j * j == knight) {
                    count++;
                } else if (knight % j == 0) {
                    count += 2;
                }
            }
            answer += (count <= limit) ? count : power;
        }
        
        return answer;
    }
}