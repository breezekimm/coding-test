import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;

        // mainContainer(FIFO) => Queue
        Queue<Integer> mainContainer = new LinkedList<>();

        // mainContainer 에 박스를 순서대로 담기
        for (int i = 0; i < order.length; i++) {
            mainContainer.add(i + 1);
        }

        // 이미 옮긴 박스를 저장할 Set
        Set<Integer> movedBox = new HashSet<>();

        // subContainer(LIFO)
        Stack<Integer> subContainer = new Stack<>();

        int i = 0;
        while (i < order.length) {
            int targetBox = order[i];

            // mainContainer 체크
            if (!mainContainer.isEmpty() && targetBox == mainContainer.peek()) {
                answer++;
                movedBox.add(targetBox);
                mainContainer.poll();
                i++;
            }

            // subContainer 체크
            else if (!subContainer.isEmpty() && subContainer.peek() == targetBox) {
                answer++;
                movedBox.add(targetBox);
                subContainer.pop();
                i++;
            }

            // subContainer 로 이동
            else if (!mainContainer.isEmpty() && targetBox != mainContainer.peek()) {
                subContainer.push(mainContainer.poll());
            }

            // 이동할 수 없는 경우
            else {
                break;
            }
        }
        return answer;
    }
}