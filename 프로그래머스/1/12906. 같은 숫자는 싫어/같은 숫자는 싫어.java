import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        Stack<Integer> s = new Stack();

        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty() || s.peek() != arr[i]) {
                s.add(arr[i]);
            }
        }
        
        answer = s.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}