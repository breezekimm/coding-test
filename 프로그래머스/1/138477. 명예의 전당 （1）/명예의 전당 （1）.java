import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue pq = new PriorityQueue();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                // k일 까지는 명예의 전당 등록
                pq.add(score[i]);
            } else {
                int min = (int)pq.peek();
                if (min < score[i]) {
                    pq.poll();
                    pq.add(score[i]);
                }
            }
                answer[i] = ((int)pq.peek());
        }
        return answer;
    }
}