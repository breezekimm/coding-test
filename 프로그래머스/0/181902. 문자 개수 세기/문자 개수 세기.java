class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] my_stringArr = my_string.split("");
        int count = 0;

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < my_stringArr.length; j++) {
                if (my_stringArr[j].equals(alphabet[i])) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}