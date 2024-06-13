class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxHeight = 0;
        int maxWidth = 0;
        
        for (int[] size : sizes) {
            int height = Math.max(size[0], size[1]);
            int width = Math.min(size[0], size[1]);

            if (height > maxHeight) {
                maxHeight = height;
            }

            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        answer = maxHeight * maxWidth;
        return answer;
    }
}