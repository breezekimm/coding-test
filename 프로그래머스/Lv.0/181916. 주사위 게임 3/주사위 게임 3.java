import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        int[] nums = {a, b, c, d};
        Arrays.sort(nums);

        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int num : nums) {
            integerMap.put(num, integerMap.getOrDefault(num, 0) + 1);
        }

        if (integerMap.size() == 1) {
            answer = 1111 * nums[0];
        } else if (integerMap.size() == 4) {
            answer = nums[0];
        } else if (integerMap.size() == 2 && integerMap.containsValue(2)) {
            answer =((nums[0] + nums[2]) * Math.abs((nums[0] - nums[2])));
        } else if (integerMap.containsValue(3)) {
            if (nums[0] == nums[1]) {
                answer = (int)Math.pow((10 * nums[0] + nums[3]), 2);
            } else {
                answer = (int)Math.pow((10 * nums[3] + nums[0]), 2);
            }
        } else if (integerMap.size() == 3) {
            for (Map.Entry<Integer, Integer> entry : integerMap.entrySet()) {
                if (entry.getValue() == 1) {
                    answer *= entry.getKey();
                }
            }
        }
        
        return answer;
    }
}