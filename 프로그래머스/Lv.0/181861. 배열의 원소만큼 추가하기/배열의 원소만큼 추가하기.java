class Solution {
    public int[] solution(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++ ) {
            str += (arr[i] + " ").repeat(arr[i]);
        }

        String[] strArr = str.split(" ");
        int[] answer = new int[strArr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }
        return answer;
    }
}