import java.util.*;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;

        int totalCount = 0;
        for (int i = 0; i < picks.length; i++) {
            totalCount += picks[i] * 5;
        }

        // 곡괭이 한도 이상(갯수 * 5)의 광석들 버리기
        if (minerals.length > totalCount) {
            minerals = Arrays.copyOfRange(minerals, 0, totalCount);
        }

        // 한 번에 캘 수 있는 5개 단위로 2차원 배열 생성
        int[][] fiveMinerals = new int[minerals.length % 5 == 0 ? minerals.length / 5 : minerals.length / 5 + 1][3];

        // 각 광석의 갯수 카운트
        int index = 0;
        for (int i = 0; i < minerals.length; i++) {
            if (i != 0 && i % 5 == 0) {
                index++;
            }
            if (minerals[i].equals("diamond")) {
                fiveMinerals[index][0]++;
            } else if (minerals[i].equals("iron")) {
                fiveMinerals[index][1]++;
            } else {
                fiveMinerals[index][2]++;
            }
        }

        // 배열을 첫 번째 요소와 두 번째 요소를 기준으로 내림차순 정렬
        Arrays.sort(fiveMinerals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    // 첫 번째 요소가 다르면 첫 번째 요소를 기준으로 내림차순 정렬
                    return Integer.compare(b[0], a[0]);
                } else {
                    // 첫 번째 요소가 같으면 두 번째 요소를 기준으로 내림차순 정렬
                    return Integer.compare(b[1], a[1]);
                }
            }
        });

        int j = 0;
        for (int i = 0; i < picks.length && j < fiveMinerals.length; i++) {
            while (picks[i] > 0 && j < fiveMinerals.length) {
                int diamond = fiveMinerals[j][0];
                int iron = fiveMinerals[j][1];
                int stone = fiveMinerals[j][2];

                if (i == 0) {
                    answer += diamond + iron + stone;
                } else if (i == 1) {
                    answer += diamond * 5 + iron + stone;
                } else {
                    answer += diamond * 25 + iron * 5 + stone;
                }
                picks[i]--;
                j++;
            }
        }
        return answer;
    }
}