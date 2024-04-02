class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String format = "%0" + n + "d";

        for (int i = 0; i < arr1.length; i++) {
            String key1 = String.format(format, Long.parseLong(Integer.toBinaryString(arr1[i])));
            String key2 = String.format(format, Long.parseLong(Integer.toBinaryString(arr2[i])));
            answer[i] = "";
            for (int j = 0; j < key1.length(); j++) {
                if (key1.charAt(j) == '1' || key2.charAt(j) == '1') {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        return answer;
    }
}