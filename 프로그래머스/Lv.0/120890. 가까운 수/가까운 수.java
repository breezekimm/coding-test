import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);

        int min = Math.abs(n - array[array.length - 1]);
        int answer = array[array.length - 1];

        for (int i = array.length - 1; i >= 0; i--) {
            if (min >= Math.abs(n - array[i])) {
                min = Math.abs(n - array[i]);
                answer = array[i];
            }
        }
        return answer;
    }
}