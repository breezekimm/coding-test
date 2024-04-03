import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        Map<String, Integer> exts = new HashMap<>();
        exts.put("code", 0);
        exts.put("date", 1);
        exts.put("maximum", 2);
        exts.put("remain", 3);

        int index = exts.get(ext);

        Arrays.sort(data, Comparator.comparingInt(o -> o[index]));

        outdata : for(int i = 0; i < data.length; i++) {
            //for (int[] d : data) {
            for (int j = 0; j < data[i].length; i++) {
                if (data[i][index] > val_ext) {
                    answer = Arrays.copyOfRange(data, 0, i);
                    break outdata;
                }
            }
        }
        
        Arrays.sort(answer, Comparator.comparingInt(o -> o[exts.get(sort_by)]));
        return answer;
    }
}