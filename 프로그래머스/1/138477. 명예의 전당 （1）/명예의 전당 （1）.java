import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                // k일 까지는 명예의 전당 등록
                pq.add(score[i]);
            } else {
                int min = pq.peek();
                if (min < score[i]) {
                    pq.poll();          // 최솟값 제거
                    pq.add(score[i]);   // 새로운 점수를 명예의 전당 등록
                }
            }
                answer[i] = pq.peek();
        }
        return answer;
    }
}