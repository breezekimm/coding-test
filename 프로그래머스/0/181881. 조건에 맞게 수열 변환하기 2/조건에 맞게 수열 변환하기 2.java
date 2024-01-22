import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arr2 = new int[arr.length];
        int step = 0;

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr2[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr2[i] = (arr[i] * 2) + 1;
                } else {
                    arr2[i] = arr[i];
                }
            }
            step++;

            if (Arrays.equals(arr, arr2)) {
                answer = step -1 ;
                break;
            } else {
                arr = Arrays.copyOfRange(arr2, 0, arr2.length);
            }
        }
        return answer;
    }
}