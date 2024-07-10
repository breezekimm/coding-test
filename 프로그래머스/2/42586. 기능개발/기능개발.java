import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 작업이 완료되는데 필요한 날짜 계산
        int[] cntDate = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            cntDate[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
        }

        // 동일한 배포 날짜
        List<Integer> cntSameDeployDate = new ArrayList<>();
        int maxDate = cntDate[0];
        int deployCount = 1;

        for (int i = 1; i < cntDate.length; i++) {
            if (maxDate >= cntDate[i]) {
                deployCount++;
            } else {
                cntSameDeployDate.add(deployCount);
                deployCount = 1;
                maxDate = cntDate[i];
            }
        }
        cntSameDeployDate.add(deployCount);

        return cntSameDeployDate.stream().mapToInt(Integer::intValue).toArray();
    }
}